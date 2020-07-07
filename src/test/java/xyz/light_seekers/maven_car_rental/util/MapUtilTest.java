package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}