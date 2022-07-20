package lk.ijse.spring.service;
import lk.ijse.spring.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    public void saveVehicle(VehicleDTO dto);

    public void deleteVehicle(String id);

    public void updateVehicle(VehicleDTO dto);

    public VehicleDTO searchVehicle(String id);

    public List<VehicleDTO> getAllVehicles();
}
