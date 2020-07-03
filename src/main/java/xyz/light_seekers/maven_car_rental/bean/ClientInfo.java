package xyz.light_seekers.maven_car_rental.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class ClientInfo implements Serializable {

    @NotNull(message = "{client_info.id.not_null}")
    private Integer id;

    @NotBlank(message = "{client_info.name.not_blank}")
    private String name;

    @Pattern(regexp = "^[0-9a-zA-Z]{6,16}$", message = "{client_info.password.pattern}")
    private String password;

    @Pattern(regexp = "^[男女]&", message = "{client_info.sex.sex.pattern}")
    private String sex;

    @Min(message = "{client_info.age.min}", value = 18)
    private Integer age;

    @Pattern(regexp = "^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$", message = "{client_info.id_card.pattern}")
    private String idCard;

    @Pattern(regexp = "^[0-9]{11}$", message = "{client_info.phone.pattern}")
    private String phone;

    @NotBlank(message = "{client_info.work_address.not_blank}")
    private String workAddress;

    @NotBlank(message = "{client_info.address.not_blank}")
    private String address;

    @Pattern(regexp = "^[1-9]\\d{5}$", message = "{client_info.postal_card.pattern}")
    private String postalCard;

    @Email(message = "{client_info.email.pattern}")
    private String email;

    @Pattern(regexp = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}(\\d|x|X)$", message = "{client_info.pass_post_number.pattern}")
    private String passPostNumber;

    private String driverLicenseType;

    @Past(message = "{client_info.commencement_date.past}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date commencementDate;

    @Future(message = "{client_info.end_date.future}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;

    @Min(value = 0, message = "{client_info.driver_age.min}")
    private Integer driverAge;

    @Range(min = 0, max = 1, message = "{client_info.vip.range}")
    private Integer vip;

    @NotNull(message = "{client_info.vip_category.not_null}")
    private Integer vipCategory;

    @NotBlank(message = "{client_info.mortgage_category.not_blank}")
    private String mortgageCategory;

    @NotBlank(message = "{client_info.guarantor.not_blank}")
    private String guarantor;

    @Pattern(regexp = "^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$", message = "{client_info.guarantor_id_card.pattern}")
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