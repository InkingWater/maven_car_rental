package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import xyz.light_seekers.maven_car_rental.bean.CarInfo;
import xyz.light_seekers.maven_car_rental.bean.EmployeeInfo;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/7 16:59
 */
@Slf4j
public class MapUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void deleteItem() {
        Map<String, Object> map = new HashMap<>();
        map.put("password", "1321231");
        map.put("username", "12315456");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("password");
        MapUtil.deleteItem(map, objects);
        log.info(map.toString());
    }

    @Test
    public void deleteListMapItem() {
    }

    @Test
    public void mapOperation() {
        Map<String, Object> map = new HashMap<>();
        MapUtil.mapOperation(map, 1);
        log.info(map.toString());
    }

    @Test
    public void object2Map() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName("Red");
        employeeInfo.setEmail("Red@qq.com");
        List<String> exclusion = new LinkedList<>();
        exclusion.add("password");
        log.info(MapUtil.object2Map(employeeInfo, exclusion).toString());
    }
}