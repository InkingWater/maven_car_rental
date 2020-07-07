package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:06
 */
public interface IEmployeeService {
    Map<String, Object> login(String phone, String password) throws RuntimeException;

    Map<String, Object> selectCriteria(String id, String name, String phone, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> isAdmin(String phone) throws RuntimeException;

    Map<String, Object> getUserInfo(String phone) throws RuntimeException;

    Map<String, Object> modifyUserInfo(EmployeeInfo employeeInfo) throws RuntimeException;

    Map<String, Object> addUserInfo(EmployeeInfo employeeInfo) throws RuntimeException;

    Map<String, Object> deleteUserInfos(List<String> phones) throws RuntimeException;
}
