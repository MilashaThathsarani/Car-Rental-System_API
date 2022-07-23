package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo driverRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(String id) {

    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }

    @Override
    public DriverDTO searchDriver(String id) {
        return null;
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        return null;
    }

    @Override
    public DriverDTO findName(String id) {
        return null;
    }
}
