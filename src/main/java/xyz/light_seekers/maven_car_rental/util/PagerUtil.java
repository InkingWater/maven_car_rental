package xyz.light_seekers.maven_car_rental.util;

import java.util.List;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/6 8:42
 */
public class PagerUtil {
    public static <T> List<T> paging(List<T> data, Integer pageNum, Integer pageSize) {
        return data.subList((pageNum - 1) * pageSize, data.size() > pageNum * pageSize ? pageNum * pageSize : data.size());
    }
}
