package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
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
    private final String status = "Pending";

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<VehicleRent> rentals = new ArrayList<>();

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();
}
