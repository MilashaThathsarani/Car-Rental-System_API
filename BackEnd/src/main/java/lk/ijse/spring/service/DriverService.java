package lk.ijse.spring.service;
import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    public void saveDriver(DriverDTO dto);

    public void deleteDriver(String id);

    public void updateDriver(DriverDTO dto);

    public DriverDTO searchDriver(String id);

    public List<DriverDTO> getAllDrivers();

    boolean findDriverByUsername(String username);

    boolean findDriverByPassword(String password);

    DriverDTO findDriverByUsernameAndPassword(String username, String password);

    void updateDriverNonAvailable(String driverId);

    void updateDriverAvailable(String driverId);

    List<DriverDTO> getAllAvailableDrivers();

    List<DriverDTO> getAllNonAvailableDrivers();

    int getCountOfDriversByStatus(boolean availability);
}
