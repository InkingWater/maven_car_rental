package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.TypeInfo;
import xyz.light_seekers.maven_car_rental.bean.TypeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.TypeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.ITypeService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/7 22:56
 */
@Service
@Qualifier(value = "InsuranceTypeService")
public class InsuranceTypeServiceImpl implements ITypeService {

    @Autowired
    private TypeInfoMapper typeInfoMapper;

    private final Integer Category = 2;

    @Override
    public Map<String, Object> selectCriteria(String name, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        TypeInfoExample typeInfoExample = new TypeInfoExample();
        typeInfoExample.createCriteria().andCategoryEqualTo(Category);
        if (StringUtil.notEmptyOrNull(name)) {
            typeInfoExample.createCriteria().andNameLike("%" + name + "%");
        }
        List<TypeInfo> typeInfos = typeInfoMapper.selectByExample(typeInfoExample);
        result.put("items", PagerUtil.paging(typeInfos, pageNum, pageSize));
        result.put("size", typeInfos.size());
        return result;
    }

    @Override
    public Map<String, Object> modifyTypeInfo(TypeInfo typeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        typeInfo.setCategory(Category);
        int i = typeInfoMapper.updateByPrimaryKey(typeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> addTypeInfo(TypeInfo typeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        typeInfo.setCategory(Category);
        int i = typeInfoMapper.insertSelective(typeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteTypeInfo(List<Integer> ids) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        TypeInfoExample typeInfoExample = new TypeInfoExample();
        typeInfoExample.createCriteria().andIdIn(ids)
                .andCategoryEqualTo(Category);
        int i = typeInfoMapper.deleteByExample(typeInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }
}
