package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.AdminAccountDTO;
import lk.ijse.spring.repo.AdminAccountRepo;
import lk.ijse.spring.service.AdminAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminAccountServiceImpl implements AdminAccountService {

    @Autowired
    AdminAccountRepo adminAccountRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveAdmin(AdminAccountDTO dto) {

    }

    @Override
    public void deleteAdmin(String id) {

    }

    @Override
    public void updateAdmin(AdminAccountDTO dto) {

    }

    @Override
    public AdminAccountDTO searchAdmin(String id) {
        return null;
    }

    @Override
    public List<AdminAccountDTO> getAllAdmins() {
        return null;
    }
}
