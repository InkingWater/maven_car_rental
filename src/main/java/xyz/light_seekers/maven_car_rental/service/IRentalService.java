package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.bean.RentalInfo;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/11 0:01
 */
public interface IRentalService {
    Map<String, Object> rental(String clientPhone, String employeePhone, Date rentalDate, String carId, Integer rentalMode,
                               Integer calculateNumber) throws RuntimeException;

    Map<String, Object> renewal(String id, Integer renewalNum, String employeePhone) throws RuntimeException;

    Map<String, Object> revert(String id, Double otherFee, String employeePhone) throws RuntimeException;

    Map<String, Object> cancel(String id, String status, String employeePhone) throws RuntimeException;

    Map<String, Object> selectCriteria(String id, String carId, Date beginDate, Date endDate, Integer pageNum, Integer pageSize) throws RuntimeException;

    Map<String, Object> generateContract(String clientPhone, String employeePhone, Date rentalDate, String carId, Integer rentalMode,
                                         Integer calculateNumber) throws RuntimeException;

    Map<String, Object> downloadContract(String rentalId, HttpServletResponse response) throws RuntimeException;

    Map<String, Object> getMonthlyRental() throws RuntimeException;

    RentalInfo selectSingleRental(String id) throws RuntimeException;
}
