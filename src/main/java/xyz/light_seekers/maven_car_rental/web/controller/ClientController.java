package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.Pattern;
import java.util.Date;

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
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public MessageUtil.Message login(@RequestBody @Pattern(regexp = "^[0-9]{11}$", message = "{client.phone.pattern}") String phone, String password) {
        return MessageUtil.success();
    }

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public MessageUtil.Message test(@RequestBody @Validated VipTypeInfo vipTypeInfo, String test) {
        System.out.println(vipTypeInfo);
        System.out.println(test);
        return MessageUtil.success();
    }

    @RequestMapping(value = "/test2", method = {RequestMethod.POST})
    public MessageUtil.Message test2(Date date) {
        log.info(date.toString());
        return MessageUtil.success();
    }

    @RequestMapping(value = "/test3", method = {RequestMethod.POST})
    public MessageUtil.Message test3(@RequestBody CarInfo carInfo) {
        log.info(carInfo.toString());
        return MessageUtil.success();
    }
}
