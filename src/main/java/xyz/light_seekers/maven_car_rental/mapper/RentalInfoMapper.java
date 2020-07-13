package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.light_seekers.maven_car_rental.bean.RentalInfo;
import xyz.light_seekers.maven_car_rental.bean.RentalInfoExample;

@Repository
public interface RentalInfoMapper {
    long countByExample(RentalInfoExample example);

    int deleteByExample(RentalInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RentalInfo record);

    int insertSelective(RentalInfo record);

    List<RentalInfo> selectByExample(RentalInfoExample example);

    RentalInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RentalInfo record, @Param("example") RentalInfoExample example);

    int updateByExample(@Param("record") RentalInfo record, @Param("example") RentalInfoExample example);

    int updateByPrimaryKeySelective(RentalInfo record);

    int updateByPrimaryKey(RentalInfo record);
}