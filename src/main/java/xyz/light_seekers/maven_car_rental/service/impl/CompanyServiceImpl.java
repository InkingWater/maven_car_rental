package xyz.light_seekers.maven_car_rental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.CompanyInfo;
import xyz.light_seekers.maven_car_rental.bean.CompanyInfoExample;
import xyz.light_seekers.maven_car_rental.bean.CompanyInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.CompanyInfoMapper;
import xyz.light_seekers.maven_car_rental.service.ICompanyService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.PagerUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/9 16:58
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public Map<String, Object> selectCriteria(String name, Integer category, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        if (StringUtil.notEmptyOrNull(name)) {
            companyInfoExample.createCriteria()
                    .andNameLike("%" + name + "%");
        }
        if (category != null) {
            companyInfoExample.createCriteria()
                    .andCategoryEqualTo(category);
        }
        List<CompanyInfo> companyInfos = companyInfoMapper.selectByExample(companyInfoExample);
        MapUtil.mapSelect(result, companyInfos, pageNum, pageSize);
        return result;
    }

    @Override
    public Map<String, Object> addCompanyInfo(CompanyInfo companyInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = companyInfoMapper.insertSelective(companyInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> modifyCompanyInfo(CompanyInfo companyInfo) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        int i = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
        MapUtil.mapOperation(result, i);
        return result;
    }

    @Override
    public Map<String, Object> deleteCompanyInfo(List<String> ids) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        companyInfoExample.createCriteria().andIdIn(ids);
        int i = companyInfoMapper.deleteByExample(companyInfoExample);
        MapUtil.mapOperation(result, i);
        return null;
    }
}
