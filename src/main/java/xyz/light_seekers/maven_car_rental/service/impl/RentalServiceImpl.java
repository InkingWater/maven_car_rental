package xyz.light_seekers.maven_car_rental.service.impl;

import ch.qos.logback.core.rolling.helper.RenameUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.*;
import xyz.light_seekers.maven_car_rental.mapper.*;
import xyz.light_seekers.maven_car_rental.service.IOperationLogInfoService;
import xyz.light_seekers.maven_car_rental.service.IRentalService;
import xyz.light_seekers.maven_car_rental.util.CalendarUtil;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import javax.script.ScriptEngine;
import javax.validation.constraints.Max;
import java.util.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/11 9:23
 */
@Slf4j
@Service
public class RentalServiceImpl implements IRentalService {
    @Autowired
    private RentalInfoMapper rentalInfoMapper;

    @Autowired
    private ClientInfoMapper clientInfoMapper;

    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Autowired
    private VipTypeInfoMapper vipTypeInfoMapper;

    @Autowired
    private DriverRuleInfoMapper driverRuleInfoMapper;

    @Autowired
    private IOperationLogInfoService operationLogInfoService;

    @Override
    public Map<String, Object> rental(String clientPhone, String employeePhone,
                                      Date rentalDate, String carId, Integer rentalMode, Integer calculateNumber) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        RentalInfo rentalInfo = new RentalInfo();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        clientInfoExample.createCriteria().andPhoneEqualTo(clientPhone);
        ClientInfo clientInfo = clientInfoMapper.selectByExample(clientInfoExample).get(0);
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        Formatter formatter = new Formatter();
        CarInfo carInfo = carInfoMapper.selectByPrimaryKey(carId);
        // 驾照是否已经过期
        if (clientInfo.getEndDate().getTime() < Calendar.getInstance().getTime().getTime()) {
            MapUtil.mapError(result, "驾照已经到期！");
            return result;
        }
        // 驾照是否满足要求
        DriverRuleInfoExample driverRuleInfoExample = new DriverRuleInfoExample();
        driverRuleInfoExample.createCriteria().andDriverLicenseTypeEqualTo(clientInfo.getDriverLicenseType())
                .andTypeIdEqualTo(carInfo.getTypeId());
        List<DriverRuleInfo> driverRuleInfos = driverRuleInfoMapper.selectByExample(driverRuleInfoExample);
        if (driverRuleInfos.size() == 0) {
            MapUtil.mapError(result, "驾照无法驾驶改类型的车辆！");
            return result;
        }
        // 车是否可用
        CarInfoExample carErrorCheck = new CarInfoExample();
        carErrorCheck.createCriteria().andStateEqualTo("可用")
                .andIdEqualTo(carId);
        List<CarInfo> carErrorInfo = carInfoMapper.selectByExample(carErrorCheck);
        if (carErrorInfo.size() == 0) {
            MapUtil.mapError(result, "车辆目前不可用！");
            return result;
        }
        // 车已经被租用
        if (!checkOverlay(carId, rentalDate.getTime(),
                rentalDate.getTime() + rentalMode * calculateNumber * 3600 * 1000 * 24)) {
            MapUtil.mapError(result, "租车时间段中部分时间，车辆已经被租用！");
            return result;
        }
        // 可进行正常的租车
        VipTypeInfo vipTypeInfo = null;
        if (clientInfo.getVip() != 0) {
            vipTypeInfo = vipTypeInfoMapper.selectByPrimaryKey(clientInfo.getVipCategory());
        }
        Calendar calendar = Calendar.getInstance();
        rentalInfo.setId(StringUtil.generateId());
        rentalInfo.setCarId(carId);
        rentalInfo.setClientId(clientInfo.getId());
        rentalInfo.setRentalDate(rentalDate);
        rentalInfo.setRentalMode(rentalMode);
        switch (rentalMode) {
            case 1:
                rentalInfo.setRentalPrice(carInfo.getDailyRental());
                break;
            case 7:
                rentalInfo.setRentalPrice(carInfo.getWeeklyRental());
                break;
            case 30:
                rentalInfo.setRentalPrice(carInfo.getMonthlyRental());
                break;
        }
        rentalInfo.setWeekendRentalPrice(carInfo.getWeekendRental());
        rentalInfo.setCalculateNumber(calculateNumber);
        calendar.setTime(rentalDate);
        rentalInfo.setWeekendNumber(CalendarUtil.getWeekendNum(calendar, calculateNumber));
        rentalInfo.setDeposit(carInfo.getDeposit());
        rentalInfo.setLimitedKilometers(carInfo.getLimitedKilometers());
        rentalInfo.setDispatchKilometers(0.0);
        rentalInfo.setOverKmRental(carInfo.getOverKmRental());
        rentalInfo.setTimeoutRental(carInfo.getTimeoutRental());
        Calendar instance = Calendar.getInstance();
        instance.setTime(rentalDate);
        instance.add(Calendar.DAY_OF_MONTH, calculateNumber * rentalMode);
        rentalInfo.setReturnDate(instance.getTime());
        rentalInfo.setDiscount(vipTypeInfo == null ? 1.0 : vipTypeInfo.getDiscount());
        rentalInfo.setState("未开始");
        rentalInfo.setCreateDate(Calendar.getInstance().getTime());
        rentalInfo.setCreatePerson(employeeInfo.getId());
        int i = rentalInfoMapper.insertSelective(rentalInfo);
        if (i > 0) {
            operationLogInfoService.insertRecord(rentalInfo.getId(), employeeInfo.getId(),
                    formatter.format("雇员编号为%s，姓名为%s，创建了一条租赁记录，租赁记录编号为%s", employeeInfo.getId()
                            , employeeInfo.getName(), rentalInfo.getId()).toString());
        }
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> renewal(String id, Integer renewalNum, String employeePhone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        RentalInfo rentalInfo = rentalInfoMapper.selectByPrimaryKey(id);
        Formatter formatter = new Formatter();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        long l = rentalInfo.getRentalDate().getTime() + rentalInfo.getRentalMode() * rentalInfo.getCalculateNumber() * 3600 * 1000 * 24;
        if (!checkOverlay(rentalInfo.getCarId(), l, l + renewalNum * rentalInfo.getRentalMode() * 3600 * 1000 * 24)) {
            MapUtil.mapError(result, "续租时间段中部分时间，车辆已经被租用！");
            return result;
        }
        rentalInfo.setCalculateNumber(rentalInfo.getCalculateNumber() + renewalNum);
        int i = rentalInfoMapper.updateByPrimaryKeySelective(rentalInfo);
        if (i > 0) {
            operationLogInfoService.insertRecord(rentalInfo.getId(), employeeInfo.getId(),
                    formatter.format("雇员编号为%s，姓名为%s，为了一条租赁记录执行了续租操作，租赁记录编号为%s，在原有的基础上续租了%d%s", employeeInfo.getId()
                            , employeeInfo.getName(), rentalInfo.getId(), renewalNum,
                            rentalInfo.getRentalMode() == 1 ? "天" : rentalInfo.getRentalMode() == 7 ? "周" : "月").toString());
        }
        MapUtil.mapOperation(result, i);
        return result;
    }

    /**
     * 未完成
     *
     * @param id
     * @return
     * @throws RuntimeException
     */
    @Override
    public Map<String, Object> revert(String id, String otherFee, String employeePhone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Formatter formatter = new Formatter();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        RentalInfo rentalInfo = new RentalInfo();
        rentalInfo.setId(id);
        rentalInfo.setState("已结束");
        int i = rentalInfoMapper.updateByPrimaryKeySelective(rentalInfo);
        if (i > 0) {
            operationLogInfoService.insertRecord(rentalInfo.getId(), employeeInfo.getId(),
                    formatter.format("雇员编号为%s，姓名为%s，结束了一条租赁记录，租赁记录编号为%s，最终支付的金额为%f", employeeInfo.getId()
                            , employeeInfo.getName(), rentalInfo.getId(), rentalInfo.getActualCost()).toString());
        }
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> cancel(String id, String status, String employeePhone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Formatter formatter = new Formatter();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        RentalInfoExample rentalInfoExample = new RentalInfoExample();
        RentalInfoExample.Criteria criteria = rentalInfoExample.createCriteria();
        criteria.andIdEqualTo(id).andStateEqualTo("未开始");
        List<RentalInfo> rentalInfos = rentalInfoMapper.selectByExample(rentalInfoExample);
        if (rentalInfos.size() == 0) {
            result.put("success", false);
            result.put("map", "不存在订单或订单已开始");
            return result;
        }
        RentalInfo rentalInfo = new RentalInfo();
        rentalInfo.setId(id);
        rentalInfo.setState("已取消");
        int i = rentalInfoMapper.updateByPrimaryKeySelective(rentalInfo);
        if (i > 0) {
            operationLogInfoService.insertRecord(rentalInfo.getId(), employeeInfo.getId(),
                    formatter.format("雇员编号为%s，姓名为%s，取消了一条租赁记录，租赁记录编号为%s", employeeInfo.getId()
                            , employeeInfo.getName(), rentalInfo.getId()).toString());
        }
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> selectCriteria(String id, String carId, Date beginDate, Date endDate, Integer pageNum, Integer pageSize) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        RentalInfoExample rentalInfoExample = new RentalInfoExample();
        RentalInfoExample.Criteria criteria = rentalInfoExample.createCriteria();
        if (StringUtil.notEmptyOrNull(id)) {
            criteria.andIdLike("%" + id + "%");
        }
        if (StringUtil.notEmptyOrNull(carId)) {
            criteria.andCarIdLike("%" + carId + "%");
        }
        if (beginDate != null || endDate != null) {
            if (beginDate == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(2020, 5, 15);
                beginDate = calendar.getTime();
            }
            if (endDate == null) {
                endDate = Calendar.getInstance().getTime();
            }
            criteria.andCreateDateBetween(beginDate, endDate);
        }
        List<RentalInfo> rentalInfos = rentalInfoMapper.selectByExample(rentalInfoExample);
        MapUtil.mapSelect(result, rentalInfos, pageNum, pageSize);
        return result;
    }

    public boolean checkOverlay(String carId, long begin1, long end1) {
        RentalInfoExample rentalInfoExample = new RentalInfoExample();
        rentalInfoExample.createCriteria().andCarIdEqualTo(carId)
                .andStateIn(Arrays.asList(new String[]{"未开始", "已开始"}));
        List<RentalInfo> rentalInfos = rentalInfoMapper.selectByExample(rentalInfoExample);
        for (int i = 0; i < rentalInfos.size(); i++) {
            long begin2 = rentalInfos.get(i).getRentalDate().getTime();
            long end2 = rentalInfos.get(i).getRentalDate().getTime() + rentalInfos.get(i).getRentalMode() * rentalInfos.get(i).getCalculateNumber() * 1000 * 3600 * 24;
            if (Math.max(begin1, begin2) < Math.min(end1, end2)) {
                return false;
            }
        }
        return true;
    }
}
