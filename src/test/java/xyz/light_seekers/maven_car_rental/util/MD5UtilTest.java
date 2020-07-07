package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/6 10:51
 */
@Slf4j
public class MD5UtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createPassword() {
        log.info(MD5Util.createPassword("123456"));
    }
}