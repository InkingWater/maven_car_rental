package xyz.light_seekers.maven_car_rental.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.UUID;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 10:49
 */
public class StringUtil {

    public static Integer idNum = 0;

    static {
        idNum += (int) (Math.random() * 1000);
    }

    public static boolean notEmptyOrNull(String value) {
        return value != null && !"".equals(value);
    }

    public static String generateId() {
        idNum %= 1000;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Formatter formatter = new Formatter();
        return formatter.format("RC-%s-%04d", simpleDateFormat.format(date).trim(), idNum++).toString();
    }

    public static String generateIdNotIncrease() {
        idNum %= 1000;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Formatter formatter = new Formatter();
        return formatter.format("RC-%s-%04d", simpleDateFormat.format(date).trim(), idNum).toString();
    }

    public static String generateLike(String value, Boolean left, Boolean right) {
        Formatter formatter = new Formatter();
        return formatter.format("%s%s%s", left ? "%" : "", value, right ? "%" : "").toString();
    }
}
