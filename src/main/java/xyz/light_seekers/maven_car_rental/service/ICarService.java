package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 10:08
 */
public interface ICarService {

    Map<String, Object> selectCriteria(Integer typeId, Integer rentalMode, Double minPrice, Double maxPrice, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> addCarInfo(CarInfo carInfo) throws RuntimeException;

    Map<String, Object> modifyCarInfo(CarInfo carInfo) throws RuntimeException;

    Map<String, Object> deleteCarInfo(List<String> ids) throws RuntimeException;

    Map<String, Object> getTypeCar() throws RuntimeException;

    CarInfo selectSingleCar(String id) throws RuntimeException;
}
