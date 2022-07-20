package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MaintenanceDTO {
    private String maintenanceId;
    private LocalDate date;
    private String details;
    private final double cost = 0.0;
}
