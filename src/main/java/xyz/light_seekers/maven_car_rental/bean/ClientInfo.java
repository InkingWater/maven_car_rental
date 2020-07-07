package xyz.light_seekers.maven_car_rental.bean;

import java.io.Serializable;
import java.util.Date;

public class ClientInfo implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String sex;

    private Integer age;

    private String idCard;

    private String phone;

    private String workAddress;

    private String address;

    private String postalCard;

    private String email;

    private String passPostNumber;

    private String driverLicenseType;

    private Date commencementDate;

    private Date endDate;

    private Integer driverAge;

    private Integer vip;

    private Integer vipCategory;

    private String mortgageCategory;

    private String guarantor;

    private String guarantorIdCard;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostalCard() {
        return postalCard;
    }

    public void setPostalCard(String postalCard) {
        this.postalCard = postalCard == null ? null : postalCard.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassPostNumber() {
        return passPostNumber;
    }

    public void setPassPostNumber(String passPostNumber) {
        this.passPostNumber = passPostNumber == null ? null : passPostNumber.trim();
    }

    public String getDriverLicenseType() {
        return driverLicenseType;
    }

    public void setDriverLicenseType(String driverLicenseType) {
        this.driverLicenseType = driverLicenseType == null ? null : driverLicenseType.trim();
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

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getVipCategory() {
        return vipCategory;
    }

    public void setVipCategory(Integer vipCategory) {
        this.vipCategory = vipCategory;
    }

    public String getMortgageCategory() {
        return mortgageCategory;
    }

    public void setMortgageCategory(String mortgageCategory) {
        this.mortgageCategory = mortgageCategory == null ? null : mortgageCategory.trim();
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor == null ? null : guarantor.trim();
    }

    public String getGuarantorIdCard() {
        return guarantorIdCard;
    }

    public void setGuarantorIdCard(String guarantorIdCard) {
        this.guarantorIdCard = guarantorIdCard == null ? null : guarantorIdCard.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", idCard=").append(idCard);
        sb.append(", phone=").append(phone);
        sb.append(", workAddress=").append(workAddress);
        sb.append(", address=").append(address);
        sb.append(", postalCard=").append(postalCard);
        sb.append(", email=").append(email);
        sb.append(", passPostNumber=").append(passPostNumber);
        sb.append(", driverLicenseType=").append(driverLicenseType);
        sb.append(", commencementDate=").append(commencementDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", driverAge=").append(driverAge);
        sb.append(", vip=").append(vip);
        sb.append(", vipCategory=").append(vipCategory);
        sb.append(", mortgageCategory=").append(mortgageCategory);
        sb.append(", guarantor=").append(guarantor);
        sb.append(", guarantorIdCard=").append(guarantorIdCard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}