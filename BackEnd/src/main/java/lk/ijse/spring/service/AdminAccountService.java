package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminAccountDTO;

import java.util.List;

public interface AdminAccountService {
    public void saveAdmin(AdminAccountDTO adminAccountDTO);

    public void updateAdmin(AdminAccountDTO adminAccountDTO);

    public void deleteAdmin(String id);

    public AdminAccountDTO searchAdmin(String id);

    public List<AdminAccountDTO> getAllAdmins();

}
