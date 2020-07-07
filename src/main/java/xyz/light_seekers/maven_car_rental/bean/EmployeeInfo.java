package xyz.light_seekers.maven_car_rental.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class EmployeeInfo implements Serializable {
    @NotBlank(message = "{employee_info.id.not_blank}")
    private String id;

    @Pattern(regexp = "^[a-zA-Z0-9]{8,16}$", message = "{employee_info.password.pattern}")
    private String password;

    @NotBlank(message = "{employee_info.name.not_blank}")
    private String name;

    @Pattern(regexp = "^[男女]$", message = "{client_info.sex.pattern}")
    private String sex;

    @NotNull(message = "{employee_info.admin.not_null}")
    private Boolean admin;

    @Range(min = 18, max = 80, message = "{employee_info.age.range}")
    private Integer age;

    @Pattern(regexp = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$", message = "{employee_info.id_card.pattern}")
    private String idCard;

    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$", message = "{employee_info.phone.pattern}")
    private String phone;

    @NotBlank(message = "{employee_info.address.not_blank}")
    private String address;

    @Pattern(regexp = "^[0-9]{6}$",message = "{client_info.postal_card.pattern}")
    private String postalCard;

    @Email(message = "{employee_info.email.pattern}")
    private String email;


    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", admin=").append(admin);
        sb.append(", age=").append(age);
        sb.append(", idCard=").append(idCard);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", postalCard=").append(postalCard);
        sb.append(", email=").append(email);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}