package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/12 17:03
 */
@Slf4j
public class CalendarUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getWeekendNum() {
        Integer weekendNum = CalendarUtil.getWeekendNum(Calendar.getInstance(), 1);
        log.info(weekendNum + "");
    }
}