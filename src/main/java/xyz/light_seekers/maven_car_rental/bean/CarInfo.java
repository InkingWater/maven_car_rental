package xyz.light_seekers.maven_car_rental.bean;

import java.io.Serializable;
import java.util.Date;

public class CarInfo implements Serializable {
    private String id;

    private Integer typeId;

    private String name;

    private String color;

    private String motorNumber;

    private String carriageNumber;

    private Date purchaseDate;

    private String policyNumber;

    private String insuranceCompaniesId;

    private Integer insuranceCategory;

    private Date commencementDate;

    private Date endDate;

    private Double deposit;

    private Double dailyRental;

    private Double weeklyRental;

    private Double monthlyRental;

    private Double weekendRental;

    private Double limitedKilometers;

    private Double timeoutRental;

    private Double overKmRental;

    private String state;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getMotorNumber() {
        return motorNumber;
    }

    public void setMotorNumber(String motorNumber) {
        this.motorNumber = motorNumber == null ? null : motorNumber.trim();
    }

    public String getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber == null ? null : carriageNumber.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber == null ? null : policyNumber.trim();
    }

    public String getInsuranceCompaniesId() {
        return insuranceCompaniesId;
    }

    public void setInsuranceCompaniesId(String insuranceCompaniesId) {
        this.insuranceCompaniesId = insuranceCompaniesId == null ? null : insuranceCompaniesId.trim();
    }

    public Integer getInsuranceCategory() {
        return insuranceCategory;
    }

    public void setInsuranceCategory(Integer insuranceCategory) {
        this.insuranceCategory = insuranceCategory;
    }

    public Date getCommencementDate() {
        return commencementDate;
    }

    public void setCommencementDate(Date commencementDate) {
        this.commencementDate = commencementDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(Double dailyRental) {
        this.dailyRental = dailyRental;
    }

    public Double getWeeklyRental() {
        return weeklyRental;
    }

    public void setWeeklyRental(Double weeklyRental) {
        this.weeklyRental = weeklyRental;
    }

    public Double getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(Double monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public Double getWeekendRental() {
        return weekendRental;
    }

    public void setWeekendRental(Double weekendRental) {
        this.weekendRental = weekendRental;
    }

    public Double getLimitedKilometers() {
        return limitedKilometers;
    }

    public void setLimitedKilometers(Double limitedKilometers) {
        this.limitedKilometers = limitedKilometers;
    }

    public Double getTimeoutRental() {
        return timeoutRental;
    }

    public void setTimeoutRental(Double timeoutRental) {
        this.timeoutRental = timeoutRental;
    }

    public Double getOverKmRental() {
        return overKmRental;
    }

    public void setOverKmRental(Double overKmRental) {
        this.overKmRental = overKmRental;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", motorNumber=").append(motorNumber);
        sb.append(", carriageNumber=").append(carriageNumber);
        sb.append(", purchaseDate=").append(purchaseDate);
        sb.append(", policyNumber=").append(policyNumber);
        sb.append(", insuranceCompaniesId=").append(insuranceCompaniesId);
        sb.append(", insuranceCategory=").append(insuranceCategory);
        sb.append(", commencementDate=").append(commencementDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", deposit=").append(deposit);
        sb.append(", dailyRental=").append(dailyRental);
        sb.append(", weeklyRental=").append(weeklyRental);
        sb.append(", monthlyRental=").append(monthlyRental);
        sb.append(", weekendRental=").append(weekendRental);
        sb.append(", limitedKilometers=").append(limitedKilometers);
        sb.append(", timeoutRental=").append(timeoutRental);
        sb.append(", overKmRental=").append(overKmRental);
        sb.append(", state=").append(state);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}