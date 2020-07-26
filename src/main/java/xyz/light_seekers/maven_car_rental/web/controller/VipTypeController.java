package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;
import xyz.light_seekers.maven_car_rental.service.IVipTypeService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/8 22:19
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/vipType")
@Api(description = "会员类型控制器")
public class VipTypeController {

    @Autowired
    private IVipTypeService vipTypeService;

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "添加会员类型")
    public MessageUtil.Message addVipTypeInfo(@RequestBody VipTypeInfo vipTypeInfo) {
        return MessageUtil.created(vipTypeService.addVipTypeInfo(vipTypeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改会员类型")
    public MessageUtil.Message modifyVipTypeInfo(@RequestBody VipTypeInfo vipTypeInfo) {
        return MessageUtil.created(vipTypeService.modifyVipTypeInfo(vipTypeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", paramType = "query", dataType = "integer", required = true),
            @ApiImplicitParam(name = "pageNum", paramType = "query", dataType = "integer", required = true),
    })
    public MessageUtil.Message selectCriteria(String name,
                                              @Min(value = 1, message = "{page_size.min}") Integer pageSize,
                                              @Min(value = 1, message = "{page_num.min}") Integer pageNum) {
        return MessageUtil.ok(vipTypeService.selectCriteria(name, pageSize, pageNum));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "批量删除会员类型")
    public MessageUtil.Message deleteVipTypeInfos(@RequestParam(value = "ids") List<Integer> ids) {
        return MessageUtil.noContent(vipTypeService.deleteVipTypeInfo(ids));
    }

    @RequestMapping(value = "/singleInfoId", method = {RequestMethod.GET})
    @ApiOperation(value = "根据会员类型的编号查找信息")
    public MessageUtil.Message selectSingleType(Integer id) {
        return MessageUtil.ok(vipTypeService.selectSingleVipType(id));
    }
}
