package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface AdminService {
    public void saveAdmin(AdminDTO dto);

    public void deleteAdmin(String id);

    public void updateAdmin(AdminDTO dto);

    public AdminDTO searchAdmin(String id);

    public List<AdminDTO> getAllAdmins();
}