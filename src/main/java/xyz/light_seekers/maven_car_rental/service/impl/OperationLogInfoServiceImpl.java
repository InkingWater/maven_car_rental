package xyz.light_seekers.maven_car_rental.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.light_seekers.maven_car_rental.bean.OperationLogInfo;
import xyz.light_seekers.maven_car_rental.bean.OperationLogInfoExample;
import xyz.light_seekers.maven_car_rental.mapper.OperationLogInfoMapper;
import xyz.light_seekers.maven_car_rental.service.IOperationLogInfoService;
import xyz.light_seekers.maven_car_rental.util.MapUtil;
import xyz.light_seekers.maven_car_rental.util.StringUtil;

import java.util.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/13 16:44
 */
@Slf4j
@Service
public class OperationLogInfoServiceImpl implements IOperationLogInfoService {

    @Autowired
    private OperationLogInfoMapper operationLogInfoMapper;

    @Override
    public Map<String, Object> selectCriteria(String rentalId, Date beginDate, Date endDate, Integer pageSize, Integer pageNum) throws RuntimeException {
        Map<String, Object> result = new HashMap<>();
        OperationLogInfoExample operationLogInfoExample = new OperationLogInfoExample();
        OperationLogInfoExample.Criteria criteria = operationLogInfoExample.createCriteria();
        if (StringUtil.notEmptyOrNull(rentalId)) {
            criteria.andRentalIdLike(StringUtil.generateLike(rentalId, true, true));
        }
        if (beginDate != null || endDate != null) {
            if (beginDate == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(2020, 5, 15);
                beginDate = calendar.getTime();
            }
            if (endDate == null) {
                endDate = Calendar.getInstance().getTime();
            }
            criteria.andDateBetween(beginDate, endDate);
        }
        List<OperationLogInfo> operationLogInfos = operationLogInfoMapper.selectByExample(operationLogInfoExample);
        MapUtil.mapSelect(result, operationLogInfos, pageNum, pageSize);
        return result;
    }

    @Override
    public boolean insertRecord(String rentalId, String operationId, String operationContent) throws RuntimeException {
        boolean flag = false;
        OperationLogInfo operationLogInfo = new OperationLogInfo();
        operationLogInfo.setRentalId(rentalId);
        operationLogInfo.setOperationId(operationId);
        operationLogInfo.setOperationContent(operationContent);
        operationLogInfo.setDate(Calendar.getInstance().getTime());
        flag = operationLogInfoMapper.insert(operationLogInfo) > 0;
        if (!flag) {
            log.info(operationContent);
        }
        return flag;
    }
}
