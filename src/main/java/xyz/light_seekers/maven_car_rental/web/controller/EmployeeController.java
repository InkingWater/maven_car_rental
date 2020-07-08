package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.service.IEmployeeService;
import xyz.light_seekers.maven_car_rental.util.MD5Util;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.NotNull;
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
        return MessageUtil.success(employeeService.login(phone, MD5Util.createPassword(password)));
    }

    @RequestMapping(value = "/selectCriteria", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", paramType = "query", dataType = "integer", required = true),
            @ApiImplicitParam(name = "pageNum", paramType = "query", dataType = "integer", required = true),
    })
    public MessageUtil.Message selectCriteria(String id, String name, String phone,
                                              @NotNull(message = "{page_size.not_null}") Integer pageSize,
                                              @NotNull(message = "{page_num.not_null}") Integer pageNum) {
        return MessageUtil.success(employeeService.selectCriteria(id, name, phone, pageSize, pageNum));
    }

    @RequestMapping(value = "/isAdmin", method = {RequestMethod.GET})
    @ApiOperation(value = "判断是否为超级管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", paramType = "query", dataType = "string", required = true),
    })
    public MessageUtil.Message isAdmin(@Pattern(regexp = "^[0-9]{11}$", message = "{employee_info.phone.pattern}") String phone) {
        return MessageUtil.success(employeeService.isAdmin(phone));
    }

    @RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET})
    @ApiOperation(value = "获取用户的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", paramType = "query", dataType = "string", required = true),
    })
    public MessageUtil.Message getUserInfo(@Pattern(regexp = "^[0-9]{11}$", message = "{employee_info.phone.pattern}") String phone) {
        return MessageUtil.success(employeeService.getUserInfo(phone));
    }

    @RequestMapping(value = "/modifyUserInfo", method = {RequestMethod.POST})
    @ApiOperation(value = "修改用户信息")
    public MessageUtil.Message modifyUserInfo(@RequestBody EmployeeInfo employeeInfo) {
        return MessageUtil.success(employeeService.modifyUserInfo(employeeInfo));
    }

    @RequestMapping(value = "/addUserInfo", method = {RequestMethod.POST})
    @ApiOperation(value = "增加用户信息")
    public MessageUtil.Message addUserInfo(@RequestBody EmployeeInfo employeeInfo) {
        return MessageUtil.success(employeeService.addUserInfo(employeeInfo));
    }

    @RequestMapping(value = "/deleteUserInfos", method = {RequestMethod.POST})
    @ApiOperation(value = "删除用户信息")
    public MessageUtil.Message deleteUserInfos(@RequestBody List<String> phones) {
        return MessageUtil.success(employeeService.deleteUserInfos(phones));
    }
}
