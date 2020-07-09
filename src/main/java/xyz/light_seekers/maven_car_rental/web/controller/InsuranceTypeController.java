package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.TypeInfo;
import xyz.light_seekers.maven_car_rental.service.ITypeService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/8 10:36
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/insuranceType")
@Api(description = "保险类型控制器")
public class InsuranceTypeController {

    @Autowired
    @Qualifier("InsuranceTypeService")
    private ITypeService typeService;

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", paramType = "query", dataType = "integer", required = true),
            @ApiImplicitParam(name = "pageNum", paramType = "query", dataType = "integer", required = true),
    })
    public MessageUtil.Message selectCriteria(String name,
                                              @NotNull(message = "{page_size.not_null}") Integer pageSize,
                                              @NotNull(message = "{page_num.not_null}") Integer pageNum) {
        return MessageUtil.ok(typeService.selectCriteria(name, pageSize, pageNum));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改汽车类型")
    public MessageUtil.Message modifyTypeInfo(@RequestBody TypeInfo typeInfo) {
        return MessageUtil.created(typeService.modifyTypeInfo(typeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "增加汽车类型")
    public MessageUtil.Message addTypeInfo(@RequestBody TypeInfo typeInfo) {
        return MessageUtil.created(typeService.addTypeInfo(typeInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "删除汽车类型")
    public MessageUtil.Message deleteTypeInfos(@RequestParam(value = "ids") List<Integer> ids) {
        return MessageUtil.noContent(typeService.deleteTypeInfo(ids));
    }
}
