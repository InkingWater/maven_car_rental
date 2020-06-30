package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/6/30 15:40
 */
@RequestMapping(value = "/client")
@Api(description = "客户控制器")
public class ClientController {
    public static String createPassword(String password) {
        String passwordMD5 = null;
try {
    // 生成一个MD5加密计算摘要
    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
    messageDigest.update(password.getBytes());    System.out.println(21);
    System.out.println(21);

    passwordMD5 = new BigInteger(1, messageDigest.digest()).toString(16);
} catch (NoSuchAlgorithmException e) {e.printStackTrace();
    System.out.println(21);
    System.out.println(21);
    System.out.println(21);
} finally {
    return passwordMD5;
}
    }

    @GetMapping("/car")
    public Map<String,String> car(){ Map<String,String > map = new HashMap<>();map.put("brand","Benz");map.put("price","1000K");return map;}
}
