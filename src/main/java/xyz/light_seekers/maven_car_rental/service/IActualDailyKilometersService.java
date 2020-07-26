package xyz.light_seekers.maven_car_rental.service;

import java.util.Date;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/13 18:36
 */
public interface IActualDailyKilometersService {
    Map<String, Object> uploadActualDailyKilometers(String rentalId, Double dailyKilometer) throws RuntimeException;

    Map<String, Object> selectCriteria(String rentalId, Date beginDate, Date endDate, Integer pageSize, Integer pageNum) throws RuntimeException;
}
