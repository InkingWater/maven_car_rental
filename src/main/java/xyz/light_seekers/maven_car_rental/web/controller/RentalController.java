package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.service.IRentalService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/12 19:33
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/rental")
@Api(description = "租赁记录控制器")
public class RentalController {
    @Autowired
    private IRentalService rentalService;

    @RequestMapping(value = "/rental", method = {RequestMethod.POST})
    @ApiOperation(value = "租车")
    public MessageUtil.Message rental(String clientPhone, String employeePhone,
                                      Date rentalDate, String carId, Integer rentalMode, Integer calculateNumber) {
        return MessageUtil.created(rentalService.rental(clientPhone, employeePhone, rentalDate, carId, rentalMode, calculateNumber));
    }

    @RequestMapping(value = "/renewal", method = {RequestMethod.PUT})
    @ApiOperation(value = "续租")
    public MessageUtil.Message renewal(String id, Integer renewalNum, String employeePhone) {
        return MessageUtil.created(rentalService.renewal(id, renewalNum, employeePhone));
    }

    @RequestMapping(value = "/revert", method = {RequestMethod.PUT})
    @ApiOperation(value = "归还车辆")
    public MessageUtil.Message revert(String id, Double otherFee, String employeePhone) {
        return MessageUtil.created(rentalService.revert(id, otherFee, employeePhone));
    }

    @RequestMapping(value = "/cancel", method = {RequestMethod.PUT})
    @ApiOperation(value = "取消租用订单")
    public MessageUtil.Message cancel(String id, String status, String employeePhone) {
        return MessageUtil.created(rentalService.cancel(id, status, employeePhone));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(String id, String carId, Date beginDate, Date endDate, Integer pageNum, Integer pageSize) {
        return MessageUtil.ok(rentalService.selectCriteria(id, carId, beginDate, endDate, pageNum, pageSize));
    }

    @RequestMapping(value = "/contract", method = {RequestMethod.POST})
    @ApiOperation(value = "生成合同")
    public MessageUtil.Message generateContract(String clientPhone, String employeePhone, Date rentalDate
            , String carId, Integer rentalMode, Integer calculateNumber) {
        return MessageUtil.created(rentalService.generateContract(clientPhone, employeePhone, rentalDate, carId, rentalMode, calculateNumber));
    }

    @RequestMapping(value = "/contract/{rentalId}", method = {RequestMethod.GET})
    @ApiOperation(value = "下载合同")
    public void downloadContract(@PathVariable String rentalId, HttpServletResponse response) {
        rentalService.downloadContract(rentalId, response);
    }

    @RequestMapping(value = "/singleInfoId", method = {RequestMethod.GET})
    @ApiOperation(value = "根据合同的编号查询合同")
    public MessageUtil.Message selectSingleRental(String id) {
        return MessageUtil.ok(rentalService.selectSingleRental(id));
    }
}
