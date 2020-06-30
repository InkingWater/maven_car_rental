package xyz.light_seekers.maven_car_rental.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/6/30 15:40
 */
@RequestMapping(value = "/client")
@Api(description = "客户控制器")
public class ClientController {
    protected String orderByClause;

    protected boolean distinct;

    public static String createPassword(String password) {
        String passwordMD5 = null;
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());

            passwordMD5 = new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            return passwordMD5;
        }
    }
}
