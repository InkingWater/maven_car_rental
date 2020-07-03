package xyz.light_seekers.maven_car_rental.test.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.light_seekers.maven_car_rental.util.MD5Util;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:21
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MD5UtilTest {
    @Test
    public void createPassword1(){
        log.info(MD5Util.createPassword("123456"));
    }
}
