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
public class Driver {
    @Id
    private String driverId;
    private String name;
    private String address;
    private int age;
    private String contact;
    private String drivingLicenseNo;
    private String username;
    private String password;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<VehicleRent> rentals = new ArrayList<>();

}
