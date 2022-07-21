package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.MaintenanceDTO;
import lk.ijse.spring.entity.Maintenance;
import lk.ijse.spring.repo.MaintenanceRepo;
import lk.ijse.spring.service.MaintenanceService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    MaintenanceRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveMaintenance(MaintenanceDTO dto) {
        if (!repo.existsById(dto.getMaintenanceId())) {
            repo.save(mapper.map(dto, Maintenance.class));
        } else {
            throw new RuntimeException("Maintenance Already Exists...");
        }
    }

    @Override
    public void deleteMaintenance(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No Such Maintenance To Delete");
        }
    }

    @Override
    public void updateMaintenance(MaintenanceDTO dto) {
        if (repo.existsById(dto.getMaintenanceId())) {
            repo.save(mapper.map(dto, Maintenance.class));
        } else {
            throw new RuntimeException("No Such Maintenance To Update");
        }
    }

    @Override
    public MaintenanceDTO searchMaintenance(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), MaintenanceDTO.class);
        } else {
            throw new RuntimeException("Maintenance Not Found...");
        }
    }

    @Override
    public List<MaintenanceDTO> getAllMaintenance() {
        return mapper.map(repo.findAll(), new TypeToken<List<MaintenanceDTO>>() {
        }.getType());
    }
}
