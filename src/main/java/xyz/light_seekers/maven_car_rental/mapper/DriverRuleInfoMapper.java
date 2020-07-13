package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.light_seekers.maven_car_rental.bean.DriverRuleInfo;
import xyz.light_seekers.maven_car_rental.bean.DriverRuleInfoExample;

@Repository
public interface DriverRuleInfoMapper {
    long countByExample(DriverRuleInfoExample example);

    int deleteByExample(DriverRuleInfoExample example);

    int insert(DriverRuleInfo record);

    int insertSelective(DriverRuleInfo record);

    List<DriverRuleInfo> selectByExample(DriverRuleInfoExample example);

    int updateByExampleSelective(@Param("record") DriverRuleInfo record, @Param("example") DriverRuleInfoExample example);

    int updateByExample(@Param("record") DriverRuleInfo record, @Param("example") DriverRuleInfoExample example);
}