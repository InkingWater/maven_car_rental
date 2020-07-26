package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.service.ICarService;
import xyz.light_seekers.maven_car_rental.service.IRentalService;
import xyz.light_seekers.maven_car_rental.service.IVipTypeService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/14 18:07
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/statistics")
@Api(description = "信息统计控制器")
public class StatisticsController {

    @Autowired
    private IRentalService rentalService;

    @Autowired
    private ICarService carService;

    @Autowired
    private IVipTypeService vipTypeService;

    @RequestMapping(value = "/monthlyRental", method = {RequestMethod.GET})
    @ApiOperation(value = "获取一个月内的租车数据")
    public MessageUtil.Message getMonthlyRental() {
        return MessageUtil.ok(rentalService.getMonthlyRental());
    }

    @RequestMapping(value = "/typeCar", method = {RequestMethod.GET})
    @ApiOperation(value = "获取各种类型汽车的数量")
    public MessageUtil.Message getTypeCar() {
        return MessageUtil.ok(carService.getTypeCar());
    }

    @RequestMapping(value = "/vipClient", method = {RequestMethod.GET})
    @ApiOperation(value = "获取各种会员的人数")
    public MessageUtil.Message getVipClient() {
        return MessageUtil.ok(vipTypeService.getVipClient());
    }
}
