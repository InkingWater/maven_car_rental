package xyz.light_seekers.maven_car_rental.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.EmployeeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
import xyz.light_seekers.maven_car_rental.util.MD5Util;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:08
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;

    @Override
    public Map<String, Object> login(String phone, String password) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(phone)
                .andPasswordEqualTo(MD5Util.createPassword(password));
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        if (employeeInfos.size() > 0) {
            result.put("success", true);
            result.put("token", employeeInfos.get(0).getAdmin() ? "Admin-Token" : "Employee-Token");
        } else {
            result.put("success", false);
        }
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
    public Map<String, Object> getEmployeeInfo(String phone) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneEqualTo(phone);
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        /**
         * 剔除密码
         */
        List<String> exclusionName = new LinkedList<>();
        exclusionName.add("password");
        Map<String, Object> employeeInfo = MapUtil.object2Map(employeeInfos.get(0), exclusionName);
        employeeInfo.put("role", employeeInfos.get(0).getAdmin() ? new String[]{"admin"} : new String[]{"employee"});
        result.put("success", true);
        result.put("userInfo", employeeInfo);
        return result;
    }

    @Override
    public Map<String, Object> selectCriteria(String id, String name, String phone, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = employeeInfoExample.createCriteria();
        if (StringUtil.notEmptyOrNull(id)) {
            criteria.andIdLike("%" + id + "%");
        }
        if (StringUtil.notEmptyOrNull(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (StringUtil.notEmptyOrNull(phone)) {
            criteria.andPhoneLike("%" + phone + "%");
        }
        if (pageNum == null || pageSize == null) {
            pageNum = pageSize = 1;
        }
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        result.put("items", PagerUtil.paging(employeeInfos, pageNum, pageSize));
        result.put("size", employeeInfos.size());
        return result;
    }

    @Override
    public Map<String, Object> addEmployeeInfo(EmployeeInfo employeeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        employeeInfo.setPassword(MD5Util.createPassword(employeeInfo.getPassword()));
        employeeInfo.setId(UUID.randomUUID().toString().replaceAll("-", "").substring(4, 19));
        int i = employeeInfoMapper.insertSelective(employeeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> modifyEmployeeInfo(EmployeeInfo employeeInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        if (StringUtil.notEmptyOrNull(employeeInfo.getPassword())) {
            employeeInfo.setPassword(MD5Util.createPassword(employeeInfo.getPassword()));
        }
        int i = employeeInfoMapper.updateByPrimaryKeySelective(employeeInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteEmployeeInfo(List<String> phones) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andPhoneIn(phones);
        int i = employeeInfoMapper.deleteByExample(employeeInfoExample);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public EmployeeInfo selectSingleEmployee(String id) throws RuntimeException {
        return employeeInfoMapper.selectByPrimaryKey(id);
    }
}
