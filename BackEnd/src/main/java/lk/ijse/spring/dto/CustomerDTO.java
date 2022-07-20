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
    private String customerId;
    private String nic;
    private String name;
    private String newPassword;
    private String address;
    private String contact;
    private String drivingLicenseNo;
    private String email;
    private String nicImg;
    private String drivingLicenseImg;
}
