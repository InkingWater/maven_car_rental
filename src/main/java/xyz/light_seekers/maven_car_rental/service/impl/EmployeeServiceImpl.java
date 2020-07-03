package xyz.light_seekers.maven_car_rental.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.EmployeeInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
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
    public Map<String, Object> selectCriteria(String id, String name, String sex, String idCard, String phone, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        if (StringUtil.notEmptyOrNull(id)) {
            employeeInfoExample.createCriteria().andIdLike("%" + id + "%");
        }
        if (StringUtil.notEmptyOrNull(name)) {
            employeeInfoExample.createCriteria().andNameLike("%" + name + "%");
        }
        if (StringUtil.notEmptyOrNull(sex)) {
            employeeInfoExample.createCriteria().andSexEqualTo(sex);
        }
        if (StringUtil.notEmptyOrNull(idCard)) {
            employeeInfoExample.createCriteria().andIdCardLike("%" + idCard + "%");
        }
        if (StringUtil.notEmptyOrNull(phone)) {
            employeeInfoExample.createCriteria().andPhoneLike("%" + phone + "%");
        }
        List<EmployeeInfo> employeeInfos = employeeInfoMapper.selectByExample(employeeInfoExample);
        result.put("data", employeeInfos.subList((pageNum - 1) * pageSize, employeeInfos.size() > pageNum * pageSize ? pageNum * pageSize : employeeInfos.size()));
        result.put("size", employeeInfos.size());
        return result;
    }
}
