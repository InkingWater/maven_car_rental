package xyz.light_seekers.maven_car_rental.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/12 16:53
 */
@Slf4j
public class CalendarUtil {
    public static Integer getWeekendNum(Calendar calendar, Integer dayNum) {
        int weekendNum = 0;
        for (int i = 0; i <= dayNum; i++) {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
                weekendNum += 1;
            }
            calendar.add(Calendar.DATE, 1);
        }
        return weekendNum;
    }
}
