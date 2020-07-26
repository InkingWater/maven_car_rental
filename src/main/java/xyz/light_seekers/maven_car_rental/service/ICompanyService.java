package xyz.light_seekers.maven_car_rental.service;

import xyz.light_seekers.maven_car_rental.bean.CompanyInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 16:52
 */
public interface ICompanyService {
    Map<String, Object> selectCriteria(String name, Integer category, Integer pageSize, Integer pageNum) throws RuntimeException;

    Map<String, Object> addCompanyInfo(CompanyInfo companyInfo) throws RuntimeException;

    Map<String, Object> modifyCompanyInfo(CompanyInfo companyInfo) throws RuntimeException;

    Map<String, Object> deleteCompanyInfo(List<String> ids) throws RuntimeException;

    CompanyInfo selectSingleCompany(String id) throws RuntimeException;
}
