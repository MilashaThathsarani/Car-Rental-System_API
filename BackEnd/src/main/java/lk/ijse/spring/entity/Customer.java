package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
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
