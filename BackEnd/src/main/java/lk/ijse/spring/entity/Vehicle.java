//package lk.ijse.spring.entity;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
//@Entity
//public class Vehicle {
//    @Id
//    private String registrationNO;
//    private String brand;
//    private String type;
//    private int noOfPassengers;
//    private String transmissionType;
//    private String fuelType;
//    private String color;
//    private String frontViewImg;
//    private String backViewImg;
//    private String sideViewImg;
//    private String internalViewImg;
//    private double dailyRate;
//    private double monthlyRate;
//    private double freeKmForPrice;
//    private double freeKmForDuration;
//    private double lossDamageWaiver;
//    private double priceForExtraKm;
//    private double completeKm;
//    private final String status = "Available";
//
//    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
//    private List<CarRent> rentals = new ArrayList<>();
//
//    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
//    private List<Maintenance> maintenances = new ArrayList<>();
//}
