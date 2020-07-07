package xyz.light_seekers.maven_car_rental.bean;

import org.hibernate.validator.constraints.Range;
import xyz.light_seekers.maven_car_rental.valid.EnumValid;
import xyz.light_seekers.maven_car_rental.valid.enum_bean.RentalMode;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class RentalInfo implements Serializable {
    @NotBlank(message = "{rental_info.id.not_blank}")
    private String id;

    @NotBlank(message = "{rental_info.car_id.not_blank}")
    private String carId;

    @NotBlank(message = "{rental_info.employee_id.not_blank}")
    private String employeeId;

    @FutureOrPresent(message = "{rental_info.rental_date.future_or_present}")
    private Date rentalDate;

    @EnumValid(target = RentalMode.class, message = "{rental_info.rental_mode.not_null}")
    private Integer rentalMode;

    @Min(value = 0, message = "{rental_info.rental_price.min}")
    private Double rentalPrice;

    @Min(value = 0, message = "{rental_info.weekend_rental_price.min}")
    private Double weekendRentalPrice;

    @Min(value = 0, message = "{rental_info.calculate_number.min}")
    private Integer calculateNumber;

    @Min(value = 0, message = "{rental_info.weekend_number.min}")
    private Integer weekendNumber;

    @Min(value = 0, message = "{rental_info.deposit.min}")
    private Double deposit;

    @Min(value = 0, message = "{rental_info.limited_kilometers.min}")
    private Double limitedKilometers;

    @Min(value = 0, message = "{rental_info.dispatch_kilometers.min}")
    private Double dispatchKilometers;

    @Min(value = 0, message = "{rental_info.over_km_rental.min}")
    private Double overKmRental;

    @Min(value = 0, message = "{rental_info.timeout_rental.min}")
    private Double timeoutRental;

    @Future(message = "{rental_info.return_date.future}")
    private Date returnDate;

    @Min(value = 0, message = "{rental_info.return_kilometers.min}")
    private Double returnKilometers;

    @Min(value = 0, message = "{rental_info.other_fee.min}")
    private Double otherFee;

    @Range(min = 0, max = 1, message = "{rental_info.discount.range}")
    private Double discount;

    @Min(value = 0, message = "{rental_info.actual_cost.min}")
    private Double actualCost;

    @Min(value = 0, message = "{rental_info.total_cost.min}")
    private Double totalCost;

    @NotBlank(message = "{rental_info.state.not_blank")
    private String state;

    @PastOrPresent(message = "{rental_info.create_date.past}")
    private Date createDate;

    @NotBlank(message = "{rental_info.creat_person.not_blank}")
    private String createPerson;

    @PastOrPresent(message = "{rental_info.actual_return_date.past}")
    private Date actualReturnDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Integer getRentalMode() {
        return rentalMode;
    }

    public void setRentalMode(Integer rentalMode) {
        this.rentalMode = rentalMode;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Double getWeekendRentalPrice() {
        return weekendRentalPrice;
    }

    public void setWeekendRentalPrice(Double weekendRentalPrice) {
        this.weekendRentalPrice = weekendRentalPrice;
    }

    public Integer getCalculateNumber() {
        return calculateNumber;
    }

    public void setCalculateNumber(Integer calculateNumber) {
        this.calculateNumber = calculateNumber;
    }

    public Integer getWeekendNumber() {
        return weekendNumber;
    }

    public void setWeekendNumber(Integer weekendNumber) {
        this.weekendNumber = weekendNumber;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getLimitedKilometers() {
        return limitedKilometers;
    }

    public void setLimitedKilometers(Double limitedKilometers) {
        this.limitedKilometers = limitedKilometers;
    }

    public Double getDispatchKilometers() {
        return dispatchKilometers;
    }

    public void setDispatchKilometers(Double dispatchKilometers) {
        this.dispatchKilometers = dispatchKilometers;
    }

    public Double getOverKmRental() {
        return overKmRental;
    }

    public void setOverKmRental(Double overKmRental) {
        this.overKmRental = overKmRental;
    }

    public Double getTimeoutRental() {
        return timeoutRental;
    }

    public void setTimeoutRental(Double timeoutRental) {
        this.timeoutRental = timeoutRental;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Double getReturnKilometers() {
        return returnKilometers;
    }

    public void setReturnKilometers(Double returnKilometers) {
        this.returnKilometers = returnKilometers;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getActualCost() {
        return actualCost;
    }

    public void setActualCost(Double actualCost) {
        this.actualCost = actualCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carId=").append(carId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", rentalDate=").append(rentalDate);
        sb.append(", rentalMode=").append(rentalMode);
        sb.append(", rentalPrice=").append(rentalPrice);
        sb.append(", weekendRentalPrice=").append(weekendRentalPrice);
        sb.append(", calculateNumber=").append(calculateNumber);
        sb.append(", weekendNumber=").append(weekendNumber);
        sb.append(", deposit=").append(deposit);
        sb.append(", limitedKilometers=").append(limitedKilometers);
        sb.append(", dispatchKilometers=").append(dispatchKilometers);
        sb.append(", overKmRental=").append(overKmRental);
        sb.append(", timeoutRental=").append(timeoutRental);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", returnKilometers=").append(returnKilometers);
        sb.append(", otherFee=").append(otherFee);
        sb.append(", discount=").append(discount);
        sb.append(", actualCost=").append(actualCost);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", state=").append(state);
        sb.append(", createDate=").append(createDate);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", actualReturnDate=").append(actualReturnDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}