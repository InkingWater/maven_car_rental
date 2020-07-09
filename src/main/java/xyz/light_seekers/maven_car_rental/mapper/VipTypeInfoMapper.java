package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfo;
import xyz.light_seekers.maven_car_rental.bean.VipTypeInfoExample;

@Repository
public interface VipTypeInfoMapper {
    long countByExample(VipTypeInfoExample example);

    int deleteByExample(VipTypeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VipTypeInfo record);

    int insertSelective(VipTypeInfo record);

    List<VipTypeInfo> selectByExample(VipTypeInfoExample example);

    VipTypeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VipTypeInfo record, @Param("example") VipTypeInfoExample example);

    int updateByExample(@Param("record") VipTypeInfo record, @Param("example") VipTypeInfoExample example);

    int updateByPrimaryKeySelective(VipTypeInfo record);

    int updateByPrimaryKey(VipTypeInfo record);
}