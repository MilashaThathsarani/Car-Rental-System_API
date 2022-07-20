package lk.ijse.spring.service;
import lk.ijse.spring.dto.MaintenanceDTO;

import java.util.List;

public interface MaintenanceService {
    public void saveMaintenance(MaintenanceDTO dto);

    public void deleteMaintenance(String id);

    public void updateMaintenance(MaintenanceDTO dto);

    public MaintenanceDTO searchMaintenance(String id);

    public List<MaintenanceDTO> getAllMaintenance();
}
