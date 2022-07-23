package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.AdminAccountDTO;
import lk.ijse.spring.entity.AdminAccount;
import lk.ijse.spring.repo.AdminAccountRepo;
import lk.ijse.spring.service.AdminAccountService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminAccountServiceImpl implements AdminAccountService {

    @Autowired
    AdminAccountRepo adminAccountRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveAdmin(AdminAccountDTO dto) {
        if (!adminAccountRepo.existsById(dto.getUsername())) {
            adminAccountRepo.save(modelMapper.map(dto, AdminAccount.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteAdmin(String id) {
        if (adminAccountRepo.existsById(id)){
            adminAccountRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateAdmin(AdminAccountDTO dto) {
        if (adminAccountRepo.existsById(dto.getUsername())) {
            adminAccountRepo.save(modelMapper.map(dto,AdminAccount.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public AdminAccountDTO searchAdmin(String id) {
        if (adminAccountRepo.existsById(id)){
            return modelMapper.map(adminAccountRepo.findById(id).get(), AdminAccountDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<AdminAccountDTO> getAllAdmins() {
        List<AdminAccount> all = adminAccountRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<AdminAccountDTO>>(){
        }.getType());
    }
}
