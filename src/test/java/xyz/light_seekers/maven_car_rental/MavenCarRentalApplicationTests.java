package xyz.light_seekers.maven_car_rental;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MavenCarRentalApplicationTests {

    @Test
    public void contextLoads() {
        log.info(UUID.randomUUID().toString().replaceAll("-","").substring(4,19));
    }

}
