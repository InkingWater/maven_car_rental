package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.bean.ClientInfo;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;
import xyz.light_seekers.maven_car_rental.service.IClientService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/6/30 15:40
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/client")
@Api(description = "客户控制器")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    @ApiOperation(value = "客户登录")
    public MessageUtil.Message login(String phone, String password) {
        return MessageUtil.ok(clientService.login(phone, password));
    }

    @RequestMapping(value = "/password", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改密码")
    public MessageUtil.Message rePassword(String phone, String newPassword, String oldPassword) {
        return MessageUtil.created(clientService.rePassword(phone, newPassword, oldPassword));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(String phone, String name, Integer pageSize, Integer pageNum) {
        return MessageUtil.ok(clientService.selectCriteria(phone, name, pageSize, pageNum));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "添加客户信息")
    public MessageUtil.Message addClientInfo(@RequestBody ClientInfo clientInfo) {
        return MessageUtil.created(clientService.addClientInfo(clientInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改客户信息")
    public MessageUtil.Message modifyClientInfo(@RequestBody ClientInfo clientInfo) {
        return MessageUtil.created(clientService.modifyClientInfo(clientInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "删除客户信息")
    public MessageUtil.Message deleteClientInfo(@RequestParam(value = "ids") List<Integer> ids) {
        return MessageUtil.created(clientService.deleteClientInfo(ids));
    }

    @RequestMapping(value = "/rental", method = {RequestMethod.GET})
    @ApiOperation(value = "获取客户的订单信息")
    public MessageUtil.Message getClientRental(String phone) {
        return MessageUtil.ok(clientService.getClientRental(phone));
    }

    @RequestMapping(value = "/singleInfoId", method = {RequestMethod.GET})
    @ApiOperation(value = "根据客户的编号查找信息")
    public MessageUtil.Message selectSingleClient(Integer id) {
        return MessageUtil.ok(clientService.selectSingleClient(id));
    }
}
