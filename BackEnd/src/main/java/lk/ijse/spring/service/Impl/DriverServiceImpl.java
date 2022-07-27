package lk.ijse.spring.service.Impl;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (!driverRepo.existsById(dto.getDriverId())) {
            driverRepo.save(modelMapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (driverRepo.existsById(id)){
            driverRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriverId())) {
            driverRepo.save(modelMapper.map(dto,Driver.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        if (driverRepo.existsById(id)){
            return modelMapper.map(driverRepo.findById(id).get(), DriverDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> all = driverRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<DriverDTO>>(){
        }.getType());
    }

    @Override
    public DriverDTO findName(String dName) {
        Optional<Driver> driver = driverRepo.findByDriverName(dName);
        if (driver.isPresent()) {
            return modelMapper.map(driver.get(), DriverDTO.class);
        }
        return null;
    }
}
