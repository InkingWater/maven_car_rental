package xyz.light_seekers.maven_car_rental.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.EmployeeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:08
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    EmployeeInfoMapper employeeInfoMapper;

    @Override
    public Map<String, Object> login(String phone, String password) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(phone)
                .andPasswordEqualTo(password);
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        if (employeeInfos.size() > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        return result;
    }

    @Override
    public Map<String, Object> selectCriteria(String id, String name, String phone, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        if (StringUtil.notEmptyOrNull(id)) {
            employeeInfoExample.createCriteria().andIdLike("%" + id + "%");
        }
        if (StringUtil.notEmptyOrNull(name)) {
            employeeInfoExample.createCriteria().andNameLike("%" + name + "%");
        }
        if (StringUtil.notEmptyOrNull(phone)) {
            employeeInfoExample.createCriteria().andPhoneLike("%" + phone + "%");
        }
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        result.put("data", PagerUtil.paging(employeeInfos, pageNum, pageSize));
        result.put("size", employeeInfos.size());
        return result;
    }

    @Override
    public Map<String, Object> isAdmin(String phone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(phone);
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        result.put("success", true);
        result.put("isAdmin", employeeInfos.size() > 0 ? employeeInfos.get(0).getAdmin() : false);
        return result;
    }

    @Override
    public Map<String, Object> getUserInfo(String phone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(phone);
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        result.put("success", true);
        result.put("userInfo", employeeInfos.get(0));
        return result;
    }

    @Override
    public Map<String, Object> modifyUserInfo(EmployeeInfo employeeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = employeeInfoMapper.updateByPrimaryKeySelective(employeeInfo);
        result.put("success", i > 0 ? true : false);
        result.put("modifyUser", i);
        return result;
    }

    @Override
    public Map<String, Object> addUserInfo(EmployeeInfo employeeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = employeeInfoMapper.insertSelective(employeeInfo);
        result.put("success", i > 0 ? true : false);
        result.put("addNum", i);
        return result;
    }

    @Override
    public Map<String, Object> deleteUserInfos(List<String> phones) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneIn(phones);
        int i = employeeInfoMapper.deleteByExample(employeeInfoExample);
        result.put("success", i > 0 ? true : false);
        result.put("deleteNum", i);
        return result;
    }
}
