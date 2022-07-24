package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    public void saveDriver(DriverDTO driverDTO);

    public void updateDriver(DriverDTO driverDTO);

    public void deleteDriver(String id);

    public DriverDTO searchDriver(String id);

    public List<DriverDTO> getAllDrivers();

    DriverDTO findName(String name);
}
