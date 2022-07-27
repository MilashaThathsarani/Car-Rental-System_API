package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.VehicleRentDTO;
import lk.ijse.spring.repo.VehicleRentRepo;
import lk.ijse.spring.service.VehicleRentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class VehicleRentServiceImpl implements VehicleRentService {

    @Autowired
    private VehicleRentRepo vehicleRentRepo;

    @Autowired
    ModelMapper modelMapper;

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

    @Override
    public Long countDate(Date rentStartDate, Date rentEndDate) {
        return null;
    }

    @Override
    public String getLastID() {
        String lastId = vehicleRentRepo.getLastID();
        if (lastId != null) {
            String[] split = lastId.split("R");
            int id = Integer.parseInt(split[1]);
            id++;
            if (id < 10) return "R00" + id;
            else if (id < 100) return "R0" + id;
            else return "R" + id;
        }else {
            return "R001";
        }
    }
}
