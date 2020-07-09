package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
import xyz.light_seekers.maven_car_rental.util.MD5Util;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.Pattern;
import java.util.List;

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
    private IEmployeeService employeeService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    @ApiOperation(value = "雇员登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", paramType = "query", dataType = "string", required = true),
            @ApiImplicitParam(name = "password", paramType = "query", dataType = "string", required = true)
    })
    public MessageUtil.Message login(@Pattern(regexp = "^[0-9]{11}$", message = "{employee_info.phone.pattern}") String phone,
                                     @Pattern(regexp = "^[a-zA-Z0-9]{6,16}$", message = "{employee_info.password.pattern}") String password) {
        return MessageUtil.ok(employeeService.login(phone, MD5Util.createPassword(password)));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(String id, String name, String phone, Integer pageSize, Integer pageNum) {
        return MessageUtil.ok(employeeService.selectCriteria(id, name, phone, pageSize, pageNum));
    }

    @RequestMapping(value = "/isAdmin", method = {RequestMethod.GET})
    @ApiOperation(value = "判断是否为超级管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", paramType = "query", dataType = "string", required = true),
    })
    public MessageUtil.Message isAdmin(@Pattern(regexp = "^[0-9]{11}$", message = "{employee_info.phone.pattern}") String phone) {
        return MessageUtil.ok(employeeService.isAdmin(phone));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改雇员信息")
    public MessageUtil.Message modifyEmployeeInfo(@RequestBody EmployeeInfo employeeInfo) {
        return MessageUtil.created(employeeService.modifyEmployeeInfo(employeeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "增加雇员信息")
    public MessageUtil.Message addEmployeeInfo(@RequestBody EmployeeInfo employeeInfo) {
        return MessageUtil.created(employeeService.addEmployeeInfo(employeeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "删除雇员信息")
    public MessageUtil.Message deleteEmployeeInfos(@RequestParam(value = "phones") List<String> phones) {
        return MessageUtil.noContent(employeeService.deleteEmployeeInfo(phones));
    }
}
