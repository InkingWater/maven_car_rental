package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.ActualDailyKilometersInfo;
import xyz.light_seekers.maven_car_rental.bean.ActualDailyKilometersInfoExample;
import xyz.light_seekers.maven_car_rental.bean.RentalInfo;
import xyz.light_seekers.maven_car_rental.bean.RentalInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.ActualDailyKilometersInfoMapper;
import xyz.light_seekers.maven_car_rental.mapper.RentalInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IActualDailyKilometersService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/13 19:12
 */
@Service
public class ActualDailyKilometersServiceImpl implements IActualDailyKilometersService {

    @Autowired
    private ActualDailyKilometersInfoMapper actualDailyKilometersInfoMapper;

    @Autowired
    private RentalInfoMapper rentalInfoMapper;

    @Override
    public Map<String, Object> uploadActualDailyKilometers(String rentalId, Double dailyKilometer) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        RentalInfo rentalInfo = rentalInfoMapper.selectByPrimaryKey(rentalId);
        if (!"已开始".equals(rentalInfo.getState())) {
            result.put("success", false);
            result.put("msg", "当前车辆无法上传公里数据！");
            return result;
        }
        ActualDailyKilometersInfo actualDailyKilometersInfo = new ActualDailyKilometersInfo();
        actualDailyKilometersInfo.setRentalId(rentalId);
        actualDailyKilometersInfo.setDailyKilometers(dailyKilometer);
        actualDailyKilometersInfo.setTime(Calendar.getInstance().getTime());
        int i = actualDailyKilometersInfoMapper.insert(actualDailyKilometersInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> selectCriteria(String rentalId, Date beginDate, Date endDate, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        ActualDailyKilometersInfoExample actualDailyKilometersInfoExample = new ActualDailyKilometersInfoExample();
        ActualDailyKilometersInfoExample.Criteria criteria = actualDailyKilometersInfoExample.createCriteria();
        if (StringUtil.notEmptyOrNull(rentalId)) {
            criteria.andRentalIdLike(StringUtil.generateLike(rentalId, true, true));
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
            criteria.andTimeBetween(beginDate, endDate);
        }
        List<ActualDailyKilometersInfo> actualDailyKilometersInfos = actualDailyKilometersInfoMapper.selectByExample(actualDailyKilometersInfoExample);
        MapUtil.mapSelect(result, actualDailyKilometersInfos, pageNum, pageSize);
        return result;
    }
}
