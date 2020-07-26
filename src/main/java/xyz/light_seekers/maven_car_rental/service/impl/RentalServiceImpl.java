package xyz.light_seekers.maven_car_rental.service.impl;

import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.*;
import xyz.light_seekers.maven_car_rental.mapper.*;
import xyz.light_seekers.maven_car_rental.service.IActualDailyKilometersService;
import xyz.light_seekers.maven_car_rental.service.IOperationLogService;
import xyz.light_seekers.maven_car_rental.service.IRentalService;
import xyz.light_seekers.maven_car_rental.service.ITypeService;
import xyz.light_seekers.maven_car_rental.util.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
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
    private IOperationLogService operationLogInfoService;

    @Autowired
    private ActualDailyKilometersInfoMapper actualDailyKilometersInfoMapper;

    @Autowired
    private TypeInfoMapper typeInfoMapper;

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
                    formatter.format("雇员编号为%s，姓名为%s，生成了一份合同，合同编号为%s", employeeInfo.getId()
                            , employeeInfo.getName(), rentalInfo.getId()).toString());
            formatter.close();
            formatter = new Formatter();
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
    public Map<String, Object> revert(String id, Double otherFee, String employeePhone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Formatter formatter = new Formatter();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        RentalInfo info = rentalInfoMapper.selectByPrimaryKey(id);
        RentalInfo rentalInfo = new RentalInfo();
        // 计算价格
        double actualCost = 0.0;
        double actualKilometers = 0.0;
        ActualDailyKilometersInfoExample actualDailyKilometersInfoExample = new ActualDailyKilometersInfoExample();
        ActualDailyKilometersInfoExample.Criteria criteria = actualDailyKilometersInfoExample.createCriteria();
        criteria.andRentalIdEqualTo(id);
        List<ActualDailyKilometersInfo> actualDailyKilometersInfos = actualDailyKilometersInfoMapper.selectByExample(actualDailyKilometersInfoExample);
        actualCost = actualCost + info.getRentalPrice() * info.getCalculateNumber() +
                (info.getWeekendRentalPrice() - info.getRentalPrice()) * info.getWeekendNumber()
                + otherFee;
        for (int i = 0; i < actualDailyKilometersInfos.size(); i++) {
            actualCost = actualCost + (actualDailyKilometersInfos.get(i).getDailyKilometers() - info.getLimitedKilometers()) * info.getOverKmRental();
            actualKilometers += actualDailyKilometersInfos.get(i).getDailyKilometers();
        }
        rentalInfo.setTotalCost(actualCost);
        rentalInfo.setReturnKilometers(actualKilometers);
        rentalInfo.setActualCost(actualCost * info.getDiscount());
        rentalInfo.setId(id);
        rentalInfo.setState("已结束");
        rentalInfo.setOtherFee(otherFee);
        rentalInfo.setActualReturnDate(Calendar.getInstance().getTime());
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

    @Override
    public Map<String, Object> generateContract(String clientPhone, String employeePhone, Date rentalDate, String carId, Integer rentalMode, Integer calculateNumber) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Map<String, String> contractContent = new HashMap<>();
        Formatter formatter = new Formatter();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        RentalInfo rentalInfo = new RentalInfo();
        ClientInfoExample clientInfoExample = new ClientInfoExample();
        clientInfoExample.createCriteria().andPhoneEqualTo(clientPhone);
        ClientInfo clientInfo = clientInfoMapper.selectByExample(clientInfoExample).get(0);
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(employeePhone);
        EmployeeInfo employeeInfo = employeeInfoMapper.selectByExample(employeeInfoExample).get(0);
        CarInfo carInfo = carInfoMapper.selectByPrimaryKey(carId);
        TypeInfo typeInfo = typeInfoMapper.selectByPrimaryKey(carInfo.getTypeId());
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
        // 可进行生成合同
        contractContent.put("RentalId", StringUtil.generateIdNotIncrease());
        contractContent.put("Lessee", clientInfo.getName());
        contractContent.put("Lessor", "九汽车租赁有限公司");
        contractContent.put("CarType", formatter.format("汽车类型为：%s，车架号为：%s", typeInfo.getName(), carInfo.getCarriageNumber()).toString());
        contractContent.put("PurchaseYear", yearFormat.format(carInfo.getPurchaseDate()));
        contractContent.put("BeginYear", yearFormat.format(rentalDate));
        contractContent.put("BeginMonth", monthFormat.format(rentalDate));
        contractContent.put("BeginDate", dateFormat.format(rentalDate));
        Calendar returnDate = Calendar.getInstance();
        returnDate.setTime(rentalDate);
        returnDate.add(Calendar.DATE, rentalMode * calculateNumber);
        contractContent.put("EndYear", yearFormat.format(returnDate.getTime()));
        contractContent.put("EndMonth", monthFormat.format(returnDate.getTime()));
        contractContent.put("EndDate", dateFormat.format(returnDate.getTime()));
        contractContent.put("TotalDate", String.valueOf(rentalMode * calculateNumber));
        contractContent.put("DailyFee", String.valueOf(carInfo.getTimeoutRental()));
        String contact = ContractUtil.createContact(contractContent);
        result.put("url", contact);
        try {
            formatter.close();
            formatter = new Formatter();
            result.put("downloadUrl", InetAddress.getLocalHost().getHostAddress() + ":12345/rental/contract/" +
                    StringUtil.generateIdNotIncrease());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    @Override
    public Map<String, Object> downloadContract(String rentalId, HttpServletResponse response) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        File file = new File(System.getProperty("user.dir") + "/contract/" + rentalId + ".pdf");
        if (file.exists()) {
            response.setContentType("application/force-download");
            response.addHeader("Content-Disposition", "attachment;fileName=" + rentalId + ".pdf");
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = null;
            BufferedInputStream bufferedInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                OutputStream outputStream = response.getOutputStream();
                int i = bufferedInputStream.read(buffer);
                while (i != -1) {
                    outputStream.write(buffer, 0, i);
                    i = bufferedInputStream.read(buffer);
                }
                result.put("success", true);
                return result;
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        result.put("success", false);
        return null;
    }

    @Override
    public Map<String, Object> getMonthlyRental() throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Map<String, Integer> statistics = new HashMap<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar now = Calendar.getInstance();
        Calendar before = Calendar.getInstance();
        before.add(Calendar.DATE, -30);
        RentalInfoExample rentalInfoExample = new RentalInfoExample();
        RentalInfoExample.Criteria criteria = rentalInfoExample.createCriteria();
        criteria.andRentalDateBetween(before.getTime(), now.getTime())
                .andStateNotIn(Arrays.asList(new String[]{"已取消"}));
        List<RentalInfo> rentalInfos = rentalInfoMapper.selectByExample(rentalInfoExample);
        while (before.getTime().getTime() < now.getTime().getTime()) {
            int i = 0;
            String formatDate = simpleDateFormat.format(before.getTime());
            for (int j = 0; j < rentalInfos.size(); j++) {
                if (formatDate.equals(simpleDateFormat.format(rentalInfos.get(j).getRentalDate()))) {
                    i++;
                }
            }
            statistics.put(formatDate, i);
            before.add(Calendar.DATE, 1);
        }
        result.put("items", statistics);
        return result;
    }

    @Override
    public RentalInfo selectSingleRental(String id) throws RuntimeException {
        return rentalInfoMapper.selectByPrimaryKey(id);
    }

    public boolean checkOverlay(String carId, long begin1, long end1) {
        RentalInfoExample rentalInfoExample = new RentalInfoExample();
        rentalInfoExample.createCriteria().andCarIdEqualTo(carId)
                .andStateIn(Arrays.asList(new String[]{"未开始", "已开始"}));
        List<RentalInfo> rentalInfos = rentalInfoMapper.selectByExample(rentalInfoExample);
        for (int i = 0; i < rentalInfos.size(); i++) {
            long begin2 = rentalInfos.get(i).getRentalDate().getTime();
            long end2 = rentalInfos.get(i).getRentalDate().getTime() +
                    rentalInfos.get(i).getRentalMode() * rentalInfos.get(i).getCalculateNumber() * 1000 * 3600 * 24;
            if (Math.max(begin1, begin2) < Math.min(end1, end2)) {
                return false;
            }
        }
        return true;
    }
}
