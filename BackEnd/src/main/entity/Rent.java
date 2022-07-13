package main.entity;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class CarRent {
    @Id
    private String rentId;
    private LocalDate date;
    private LocalDate pickUpDate;
    private LocalDate returnDate;
    private final String status = "Pending";

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "registrationNO", referencedColumnName = "registrationNO", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "licenceNo", referencedColumnName = "licenceNo", nullable = false)
    private Driver driver;
}

