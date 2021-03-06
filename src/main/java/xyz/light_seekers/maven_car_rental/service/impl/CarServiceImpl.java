package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.bean.CarInfoExample;
import xyz.light_seekers.maven_car_rental.bean.TypeInfo;
import xyz.light_seekers.maven_car_rental.bean.TypeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.CarInfoMapper;
import xyz.light_seekers.maven_car_rental.mapper.TypeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.ICarService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 10:21
 */
@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Autowired
    private TypeInfoMapper typeInfoMapper;

    @Override
    public Map<String, Object> selectCriteria(Integer typeId, Integer rentalMode, Double minPrice, Double maxPrice, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        CarInfoExample carInfoExample = new CarInfoExample();
        CarInfoExample.Criteria criteria = carInfoExample.createCriteria();
        if (typeId != null) {
            criteria.andTypeIdEqualTo(typeId);
        }
        if (rentalMode != null) {
            switch (rentalMode) {
                case 1:
                    criteria.andDailyRentalBetween(minPrice, maxPrice);
                    break;
                case 7:
                    criteria.andWeeklyRentalBetween(minPrice, maxPrice);
                    break;
                case 30:
                    criteria.andMonthlyRentalBetween(minPrice, maxPrice);
                    break;
            }
        }
        if (pageNum == null || pageSize == null) {
            pageNum = pageSize = 1;
        }
        List<CarInfo> carInfos = carInfoMapper.selectByExample(carInfoExample);
        result.put("items", PagerUtil.paging(carInfos, pageNum, pageSize));
        result.put("size", carInfos.size());
        return result;
    }

    @Override
    public Map<String, Object> addCarInfo(CarInfo carInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = carInfoMapper.insertSelective(carInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> modifyCarInfo(CarInfo carInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = carInfoMapper.updateByPrimaryKeySelective(carInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteCarInfo(List<String> ids) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        CarInfoExample carInfoExample = new CarInfoExample();
        carInfoExample.createCriteria().andIdIn(ids);
        int i = carInfoMapper.deleteByExample(carInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> getTypeCar() throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        Map<String, Long> statistics = new HashMap<>();
        TypeInfoExample typeInfoExample = new TypeInfoExample();
        TypeInfoExample.Criteria criteria = typeInfoExample.createCriteria();
        CarInfoExample carInfoExample = new CarInfoExample();
        CarInfoExample.Criteria criteriaCar = carInfoExample.createCriteria();
        criteria.andCategoryEqualTo(1);
        List<TypeInfo> typeInfos = typeInfoMapper.selectByExample(typeInfoExample);
        for (int i = 0; i < typeInfos.size(); i++) {
            criteriaCar.andTypeIdEqualTo(typeInfos.get(i).getId());
            statistics.put(typeInfos.get(i).getName(), carInfoMapper.countByExample(carInfoExample));
        }
        result.put("items", statistics);
        return result;
    }

    @Override
    public CarInfo selectSingleCar(String id) throws RuntimeException {
        return carInfoMapper.selectByPrimaryKey(id);
    }
}
