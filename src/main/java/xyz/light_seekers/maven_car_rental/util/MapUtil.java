package xyz.light_seekers.maven_car_rental.util;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/7 16:49
 */
public class MapUtil {
    public static void deleteItem(Map<String, Object> data, List<String> list) {
        data.keySet().removeIf(key -> list.contains(key));
    }

    public static void deleteListMapItem(List<Map<String, Object>> data, List<String> list) {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).keySet().removeIf(key -> list.contains(key));
        }
    }
}
