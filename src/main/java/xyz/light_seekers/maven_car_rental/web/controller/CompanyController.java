package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.light_seekers.maven_car_rental.bean.CompanyInfo;
import xyz.light_seekers.maven_car_rental.service.ICompanyService;
import xyz.light_seekers.maven_car_rental.util.MessageUtil;

import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 17:47
 */
@Slf4j
@Validated
@RestController
@RequestMapping(value = "/company")
@Api(description = "公司控制器")
public class CompanyController {
    @Autowired
    private ICompanyService companyService;

    @RequestMapping(value = "info", method = {RequestMethod.GET})
    @ApiOperation(value = "条件选择")
    public MessageUtil.Message selectCriteria(String name, Integer category, Integer pageSize, Integer pageNum) {
        return MessageUtil.ok(companyService.selectCriteria(name, category, pageSize, pageNum));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.POST})
    @ApiOperation(value = "添加合作公司信息")
    public MessageUtil.Message addCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        return MessageUtil.created(companyService.addCompanyInfo(companyInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.PUT})
    @ApiOperation(value = "修改合作公司信息")
    public MessageUtil.Message modifyCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        return MessageUtil.created(companyService.modifyCompanyInfo(companyInfo));
    }

    @RequestMapping(value = "/info", method = {RequestMethod.DELETE})
    @ApiOperation(value = "删除合作公司信息")
    public MessageUtil.Message deleteCompanyInfo(@RequestParam(value = "ids") List<String> ids) {
        return MessageUtil.created(companyService.deleteCompanyInfo(ids));
    }

    @RequestMapping(value = "/singleInfoId", method = {RequestMethod.GET})
    @ApiOperation(value = "根据公司的编号查找信息")
    public MessageUtil.Message selectSingleCompany(String id) {
        return MessageUtil.ok(companyService.selectSingleCompany(id));
    }
}
