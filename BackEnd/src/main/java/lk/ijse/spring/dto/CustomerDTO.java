package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String cusId;
    private String cusEmail;
    private String cusPassword;
    private String cusNic;
    private String cusNicImage;
    private String cusDriverLicense;
    private String cusDriverLicenseImage;
    private String cusAddress;
    private int cusContactNo;
    private String cusStatus;
}
