package xyz.light_seekers.maven_car_rental.service;

import java.util.Date;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/13 16:38
 */
public interface IOperationLogService {

    Map<String, Object> selectCriteria(String rentalId, Date beginDate, Date endDate, Integer pageSize, Integer pageNum) throws RuntimeException;

    boolean insertRecord(String rentalId, String operationId, String operationContent) throws RuntimeException;

}
