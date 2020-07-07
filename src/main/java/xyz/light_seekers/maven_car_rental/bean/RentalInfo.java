package xyz.light_seekers.maven_car_rental.bean;

import java.io.Serializable;
import java.util.Date;

public class RentalInfo implements Serializable {
    private String id;

    private String carId;

    private String employeeId;

    private Date rentalDate;

    private Integer rentalMode;

    private Double rentalPrice;

    private Double weekendRentalPrice;

    private Integer calculateNumber;

    private Integer weekendNumber;

    private Double deposit;

    private Double limitedKilometers;

    private Double dispatchKilometers;

    private Double overKmRental;

    private Double timeoutRental;

    private Date returnDate;

    private Double returnKilometers;

    private Double otherFee;

    private Double discount;

    private Double actualCost;

    private Double totalCost;

    private String state;

    private Date createDate;

    private String createPerson;

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