package xyz.light_seekers.maven_car_rental.util;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:49
 */
public class StringUtil {
    public static boolean notEmptyOrNull(String value) {
        return value != null && !"".equals(value);
    }
}
