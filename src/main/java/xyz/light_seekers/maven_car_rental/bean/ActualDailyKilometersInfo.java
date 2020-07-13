package xyz.light_seekers.maven_car_rental.bean;

import java.io.Serializable;
import java.util.Date;

public class ActualDailyKilometersInfo implements Serializable {
    private String rentalId;

    private Double dailyKilometers;

    private Date time;

    private static final long serialVersionUID = 1L;

    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId == null ? null : rentalId.trim();
    }

    public Double getDailyKilometers() {
        return dailyKilometers;
    }

    public void setDailyKilometers(Double dailyKilometers) {
        this.dailyKilometers = dailyKilometers;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rentalId=").append(rentalId);
        sb.append(", dailyKilometers=").append(dailyKilometers);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}