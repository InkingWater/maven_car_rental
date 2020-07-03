package xyz.light_seekers.maven_car_rental.bean;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class ActualDailyKilometersInfo implements Serializable {

    @NotNull(message = "{actual_daily_kilometers_info.rental_id.not_null}")
    private String rentalId;

    @DecimalMin(value = "0", message = "{actual_daily_kilometers_info.decimal_min}")
    private Double dailyKilometers;

    @PastOrPresent(message = "{actual_daily_kilometers_info.time.past_or_present}")
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