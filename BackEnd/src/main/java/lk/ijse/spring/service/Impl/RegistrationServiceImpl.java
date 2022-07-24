package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.RegistrationDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Registration;
import lk.ijse.spring.exeption.NotFoundException;
import lk.ijse.spring.repo.RegistrationRepo;
import lk.ijse.spring.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepo registrationRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveRegistration(RegistrationDTO registrationDTO) {
        if (!registrationRepo.existsById(registrationDTO.getEmail())) {
            registrationRepo.save(modelMapper.map(registrationDTO, Registration.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void updateRegistration(RegistrationDTO registrationDTO) {
        if (registrationRepo.existsById(registrationDTO.getEmail())) {
            registrationRepo.save(modelMapper.map(registrationDTO,Registration.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public void deleteRegistration(String id) {
        if (registrationRepo.existsById(id)){
            registrationRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public RegistrationDTO searchRegistration(String id) {
        if (registrationRepo.existsById(id)){
            return modelMapper.map(registrationRepo.findById(id).get(), RegistrationDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public ArrayList<RegistrationDTO> getAllRegistrations() {
        List<Registration> all = registrationRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<DriverDTO>>(){
        }.getType());
    }

    @Override
    public RegistrationDTO findEmailAndPassword(String email, String password) {
        Optional<Registration> reg = registrationRepo.findByEmailAndPassword(email, password);
        if (reg.isPresent()) {
            return modelMapper.map(reg.get(), RegistrationDTO.class);
        }
        throw new NotFoundException("Email name and Password Not Matched");
    }

    @Override
    public boolean findUser(String email) {
        boolean isAvailable = registrationRepo.existsByEmail(email);
        if (registrationRepo.existsById(email)) {
            registrationRepo.save(modelMapper.map(email, Registration.class));
            System.out.println(isAvailable+"");
            return true;
        }
        return false;
    }

    @Override
    public RegistrationDTO findNic(String nic) {
        Optional<Registration> registration = registrationRepo.findByNic(nic);
        if (registration.isPresent()) {
            return modelMapper.map(registration.get(), RegistrationDTO.class);
        }
        throw new NotFoundException("NIC Not Matched");
    }
}
