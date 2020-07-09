package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/8 21:33
 */
public interface IVipTypeService {
    Map<String, Object> addVipTypeInfo(VipTypeInfo vipTypeInfo) throws RuntimeException;

    Map<String, Object> modifyVipTypeInfo(VipTypeInfo vipTypeInfo) throws RuntimeException;

    Map<String, Object> selectCriteria(String name, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> deleteVipTypeInfo(List<Integer> ids) throws RuntimeException;
}
