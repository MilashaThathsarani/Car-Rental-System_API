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
    private String cusName;
    private String email;
    private String password;
    private String nic;
    private String nicImage;
    private String dlicense;
    private String dlicenseImage;
    private String address;
    private int contactNo;
    private String cusStatus;
}
