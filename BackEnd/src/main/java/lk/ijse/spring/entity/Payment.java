package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Payment {
    @Id
    private String paymentId;
    private LocalDate date;
    private String accountNo;
    private String accountHolderName;
    private String bankName;
    private String branchName;
    private double amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentId", referencedColumnName = "rentId",nullable = false)
    private VehicleRent rental;

    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",nullable = false)
    private Customer customer;
}
