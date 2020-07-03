package xyz.light_seekers.maven_car_rental.service;

import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:06
 */
public interface IEmployeeService {
    Map<String, Object> login(String phone, String password) throws RuntimeException;

    Map<String, Object> selectCriteria(String id, String name, String sex, String idCard, String phone,Integer pageSize,Integer pageNum) throws RuntimeException;
}
