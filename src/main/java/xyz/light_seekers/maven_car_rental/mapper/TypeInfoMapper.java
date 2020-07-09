package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.light_seekers.maven_car_rental.bean.TypeInfo;
import xyz.light_seekers.maven_car_rental.bean.TypeInfoExample;

@Repository
public interface TypeInfoMapper {
    long countByExample(TypeInfoExample example);

    int deleteByExample(TypeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TypeInfo record);

    int insertSelective(TypeInfo record);

    List<TypeInfo> selectByExample(TypeInfoExample example);

    TypeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TypeInfo record, @Param("example") TypeInfoExample example);

    int updateByExample(@Param("record") TypeInfo record, @Param("example") TypeInfoExample example);

    int updateByPrimaryKeySelective(TypeInfo record);

    int updateByPrimaryKey(TypeInfo record);
}