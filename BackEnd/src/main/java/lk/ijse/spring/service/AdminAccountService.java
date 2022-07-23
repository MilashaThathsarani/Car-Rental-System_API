package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminAccountDTO;
import lk.ijse.spring.entity.AdminAccount;

import java.util.List;

public interface AdminAccountService {
    public void saveAdmin(AdminAccountDTO dto);

    public void deleteAdmin(String id);

    public void updateAdmin(AdminAccountDTO dto);

    public AdminAccountDTO searchAdmin(String id);

    public List<AdminAccountDTO> getAllAdmins();

}
