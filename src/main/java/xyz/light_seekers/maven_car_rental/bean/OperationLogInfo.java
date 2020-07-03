package xyz.light_seekers.maven_car_rental.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class OperationLogInfo implements Serializable {
    @NotNull(message = "{operation_log_info.id.not_null}")
    private Integer id;

    @NotBlank(message = "{operation_log_info.rental_id.not_blank}")
    private String rentalId;

    @NotBlank(message = "{operation_log_info.operation_id.not_blank}")
    private String operationId;

    @NotBlank(message = "{operation_log_info.operation_content.not_blank}")
    private String operationContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId == null ? null : rentalId.trim();
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId == null ? null : operationId.trim();
    }

    public String getOperationContent() {
        return operationContent;
    }

    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent == null ? null : operationContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rentalId=").append(rentalId);
        sb.append(", operationId=").append(operationId);
        sb.append(", operationContent=").append(operationContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}