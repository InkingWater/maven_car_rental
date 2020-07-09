package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.service.ICarService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 11:48
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/car")
@Api(description = "车辆控制器")
public class CarController {
    @Autowired
    private ICarService carService;

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    public MessageUtil.Message selectCriteria(Integer typeId, Integer rentalMode, Double minPrice, Double maxPrice, Integer pageSize, Integer pageNum) {
        return MessageUtil.ok(carService.selectCriteria(typeId, rentalMode, minPrice, maxPrice, pageSize, pageNum));
    }


    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "添加汽车信息")
    public MessageUtil.Message addCarInfo(@RequestBody CarInfo carInfo) {
        return MessageUtil.created(carService.addCarInfo(carInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改汽车信息")
    public MessageUtil.Message modifyCarInfo(@RequestBody CarInfo carInfo) {
        return MessageUtil.created(carService.modifyCarInfo(carInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "删除汽车信息")
    public MessageUtil.Message deleteCarInfo(@RequestParam(value = "ids") List<String> ids) {
        return MessageUtil.created(carService.deleteCarInfo(ids));
    }
}
