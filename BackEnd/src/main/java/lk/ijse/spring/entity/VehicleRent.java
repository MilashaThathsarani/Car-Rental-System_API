//package lk.ijse.spring.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.time.LocalDate;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
//@Entity
//public class VehicleRent {
//    @Id
//    private String rentId;
//    private LocalDate date;
//    private LocalDate pickUpDate;
//    private LocalDate returnDate;
//    private final String status = "Pending";
//
//    @ManyToOne
//    @JoinColumn(name = "customerId", referencedColumnName = "customerId", nullable = false)
//    private Customer customer;
//
//    @ManyToOne
//    @JoinColumn(name = "vehicleId", referencedColumnName = "vehicleId", nullable = false)
//    private Vehicle vehicle;
//
//    @ManyToOne
//    @JoinColumn(name = "driverId", referencedColumnName = "driverId", nullable = false)
//    private Driver driver;
//}