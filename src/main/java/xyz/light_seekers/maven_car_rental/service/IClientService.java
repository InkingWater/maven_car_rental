package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.ClientInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 21:04
 */
public interface IClientService {
    Map<String, Object> login(String phone, String password) throws RuntimeException;

    Map<String, Object> rePassword(String phone, String oldPassword, String newPassword) throws RuntimeException;

    Map<String, Object> selectCriteria(String phone, String name, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> addClientInfo(ClientInfo clientInfo) throws RuntimeException;

    Map<String, Object> modifyClientInfo(ClientInfo clientInfo) throws RuntimeException;

    Map<String, Object> deleteClientInfo(List<Integer> ids) throws RuntimeException;

    Map<String, Object> getClientRental(String phone) throws RuntimeException;

    ClientInfo selectSingleClient(Integer id) throws RuntimeException;
}
