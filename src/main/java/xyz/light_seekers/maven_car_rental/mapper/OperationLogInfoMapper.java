package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.light_seekers.maven_car_rental.bean.OperationLogInfo;
import xyz.light_seekers.maven_car_rental.bean.OperationLogInfoExample;

public interface OperationLogInfoMapper {
    long countByExample(OperationLogInfoExample example);

    int deleteByExample(OperationLogInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLogInfo record);

    int insertSelective(OperationLogInfo record);

    List<OperationLogInfo> selectByExample(OperationLogInfoExample example);

    OperationLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationLogInfo record, @Param("example") OperationLogInfoExample example);

    int updateByExample(@Param("record") OperationLogInfo record, @Param("example") OperationLogInfoExample example);

    int updateByPrimaryKeySelective(OperationLogInfo record);

    int updateByPrimaryKey(OperationLogInfo record);
}