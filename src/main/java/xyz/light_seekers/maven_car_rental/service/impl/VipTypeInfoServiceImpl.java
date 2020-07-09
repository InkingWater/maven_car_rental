package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.VipTypeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IVipTypeService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/8 22:00
 */
@Service
public class VipTypeInfoServiceImpl implements IVipTypeService {

    @Autowired
    private VipTypeInfoMapper vipTypeInfoMapper;

    @Override
    public Map<String, Object> selectCriteria(String name, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        VipTypeInfoExample vipTypeInfoExample = new VipTypeInfoExample();
        if (StringUtil.notEmptyOrNull(name)) {
            vipTypeInfoExample.createCriteria().andNameLike("%" + name + "%");
        }
        List<VipTypeInfo> vipTypeInfos = vipTypeInfoMapper.selectByExample(vipTypeInfoExample);
        result.put("items", PagerUtil.paging(vipTypeInfos, pageNum, pageSize));
        result.put("size", vipTypeInfos.size());
        return result;
    }

    @Override
    public Map<String, Object> addVipTypeInfo(VipTypeInfo vipTypeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = vipTypeInfoMapper.insert(vipTypeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> modifyVipTypeInfo(VipTypeInfo vipTypeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = vipTypeInfoMapper.updateByPrimaryKeySelective(vipTypeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteVipTypeInfo(List<Integer> ids) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        VipTypeInfoExample vipTypeInfoExample = new VipTypeInfoExample();
        vipTypeInfoExample.createCriteria().andIdIn(ids);
        int i = vipTypeInfoMapper.deleteByExample(vipTypeInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }
}
