package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.service.IActualDailyKilometersService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import java.util.Date;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/13 20:57
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/actualDailyKilometers")
@Api(description = "每日行程控制器")
public class ActualDailyKilometersController {

    @Autowired
    private IActualDailyKilometersService actualDailyKilometersService;

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "上传日数据")
    public MessageUtil.Message uploadActualDailyKilometers(String rentalId, Double dailyKilometer) {
        return MessageUtil.created(actualDailyKilometersService.uploadActualDailyKilometers(rentalId, dailyKilometer));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(String rentalId, Date beginDate, Date endDate, Integer pageSize, Integer pageNum) {
        return MessageUtil.ok(actualDailyKilometersService.selectCriteria(rentalId, beginDate, endDate, pageSize, pageNum));
    }
}
