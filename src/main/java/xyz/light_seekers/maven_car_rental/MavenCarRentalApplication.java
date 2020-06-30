package xyz.light_seekers.maven_car_rental;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(
        @MapperScan("xyz.light_seekers.maven_car_rental.mapper")
)
public class MavenCarRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenCarRentalApplication.class, args);
    }

}
