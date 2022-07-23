package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Booking {
    @Id
    private String requestNumber;
    private String nicNumber;
    private String brand;
    private String rate;
    private Date rentStartDate;
    private Date rentEndDate;
    private String drName;
    @ManyToOne
    @JoinColumn(name = "registration", referencedColumnName = "email")
    private Registration registration;

    @ManyToOne
    @JoinColumn(name = "car", referencedColumnName = "carNumber")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driver", referencedColumnName = "driverId")
    private Driver driver;
}
