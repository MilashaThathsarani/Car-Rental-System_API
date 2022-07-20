package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveAdmin(AdminDTO dto) {

    }

    @Override
    public void deleteAdmin(String id) {

    }

    @Override
    public void updateAdmin(AdminDTO dto) {

    }

    @Override
    public AdminDTO searchAdmin(String id) {
        return null;
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return null;
    }
}
