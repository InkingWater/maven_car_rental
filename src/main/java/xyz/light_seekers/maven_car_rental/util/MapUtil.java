package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/7 16:49
 */
@Slf4j
public class MapUtil {
    public static void deleteItem(Map<String, Object> data, List<String> list) {
        data.keySet().removeIf(key -> list.contains(key));
    }

    public static void deleteListMapItem(List<Map<String, Object>> data, List<String> list) {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).keySet().removeIf(key -> list.contains(key));
        }
    }

    public static void mapOperation(Map<String, Object> result, Integer i) {
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        String[] splitName = name.split("[A-Z]");
        result.put("success", i > 0 ? true : false);
        result.put(splitName[0] + "Num", i);
    }

    public static <T> void mapSelect(Map<String, Object> result, List<T> data, Integer offset, Integer limit) {
        result.put("items", PagerUtil.paging(data, offset, limit));
        result.put("size", data.size());
    }

    public static Map<String, Object> object2Map(Object obj, List<String> exclusionName) {
        Map<String, Object> map = new HashMap<String, Object>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            if (exclusionName.contains(fieldName) || "serialVersionUID".equals(fieldName)) {
                continue;
            }
            Object value = null;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            map.put(fieldName, value);
        }
        return map;
    }
}
