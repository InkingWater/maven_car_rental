package xyz.light_seekers.maven_car_rental.valid.enum_bean;

/**
 * @Description:
 * @Author: Light
 * @Date: 2020/7/3 9:30
 */
public enum RentalMode {
    OneDay(1), Weekend(7), Mouth(30);
    private Integer dayNum;

    RentalMode(Integer dayNum) {
        this.dayNum = dayNum;
    }

    public Integer getDayNum() {
        return dayNum;
    }

    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }
}
