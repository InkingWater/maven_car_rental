package xyz.light_seekers.maven_car_rental.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.light_seekers.maven_car_rental.bean.ActualDailyKilometersInfo;
import xyz.light_seekers.maven_car_rental.bean.ActualDailyKilometersInfoExample;

public interface ActualDailyKilometersInfoMapper {
    long countByExample(ActualDailyKilometersInfoExample example);

    int deleteByExample(ActualDailyKilometersInfoExample example);

    int deleteByPrimaryKey(String rentalId);

    int insert(ActualDailyKilometersInfo record);

    int insertSelective(ActualDailyKilometersInfo record);

    List<ActualDailyKilometersInfo> selectByExample(ActualDailyKilometersInfoExample example);

    ActualDailyKilometersInfo selectByPrimaryKey(String rentalId);

    int updateByExampleSelective(@Param("record") ActualDailyKilometersInfo record, @Param("example") ActualDailyKilometersInfoExample example);

    int updateByExample(@Param("record") ActualDailyKilometersInfo record, @Param("example") ActualDailyKilometersInfoExample example);

    int updateByPrimaryKeySelective(ActualDailyKilometersInfo record);

    int updateByPrimaryKey(ActualDailyKilometersInfo record);
}