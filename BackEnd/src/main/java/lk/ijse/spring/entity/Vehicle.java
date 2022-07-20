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
public class Vehicle {
    @Id
    private String vehicleId;
    private String registerNo;
    private String brand;
    private String colour;
    private String frontViewImg;
    private String backViewImg;
    private String sideViewImg;
    private String interiorViewImg;
    private String type;
    private String noOfPassengers;
    private String transmissionType;
    private String fuelType;
    private double dailyRate;
    private double monthlyRate;
    private double freeMileageForPrice;
    private double freeMileageForDuration;
    private double price;
    private String priceForExtraKM;
}
