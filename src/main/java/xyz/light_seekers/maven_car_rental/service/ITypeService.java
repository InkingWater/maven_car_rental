package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.TypeInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/7 22:25
 */
public interface ITypeService {
    Map<String, Object> selectCriteria(String name, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> modifyTypeInfo(TypeInfo typeInfo) throws RuntimeException;

    Map<String, Object> addTypeInfo(TypeInfo typeInfo) throws RuntimeException;

    Map<String, Object> deleteTypeInfos(List<Integer> ids) throws RuntimeException;
}
