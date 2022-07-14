package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String address;
    private int contactNo;
    private String email;
    private String nicNo;
    private String nicFrontImg;
    private String nicBackImg;
    private String licenceNo;
    private String licenceImg;
    private String username;
    private String password;
    private final String status = "Pending";

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<CarRent> rentals = new ArrayList<>();

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();
}
