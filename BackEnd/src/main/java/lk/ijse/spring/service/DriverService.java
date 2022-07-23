package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    public void saveDriver(DriverDTO dto);

    public void deleteDriver(String id);

    public void updateDriver(DriverDTO dto);

    public DriverDTO searchDriver(String id);

    public List<DriverDTO> getAllDrivers();

    DriverDTO findName(String id);
}
