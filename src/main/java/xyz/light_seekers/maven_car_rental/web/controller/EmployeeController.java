package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
import xyz.light_seekers.maven_car_rental.util.MD5Util;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.Pattern;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:01
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/employee")
@Api(description = "雇员控制器")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    @ApiOperation(value = "雇员登录")
    public MessageUtil.Message login(@Pattern(regexp = "^[0-9]{11}$", message = "{employee_info.phone.pattern}") String phone,
                                     @Pattern(regexp = "^[a-zA-Z0-9]{6,16}$", message = "{employee_info.password.pattern}") String password) {
        return MessageUtil.success(employeeService.login(phone, MD5Util.createPassword(password)));
    }

    @RequestMapping(value = "/selectCriteria", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(String id, String name, String sex, String idCard, String phone, Integer pageSize, Integer pageNum) {
        return MessageUtil.success(employeeService.selectCriteria(id, name, sex, idCard, phone, pageSize, pageNum));
    }
}
