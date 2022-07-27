package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.VehicleRentDTO;
import lk.ijse.spring.service.VehicleRentService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleRentServiceImpl implements VehicleRentService {
    @Override
    public void saveVehicleRent(VehicleRentDTO dto) {

    }

    @Override
    public void deleteVehicleRent(String id) {

    }

    @Override
    public void updateVehicleRent(VehicleRentDTO dto) {

    }

    @Override
    public VehicleRentDTO searchVehicleRent(String id) {
        return null;
    }

    @Override
    public List<VehicleRentDTO> getAllVehicleRents() {
        return null;
    }
}
