package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.RegistrationDTO;
import lk.ijse.spring.repo.RegistrationRepo;
import lk.ijse.spring.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepo registrationRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveRegistration(RegistrationDTO registrationDTO) {

    }

    @Override
    public void deleteRegistration(String s) {

    }

    @Override
    public RegistrationDTO searchRegistration(String s) {
        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAllRegistrations() {
        return null;
    }

    @Override
    public void updateRegistration(RegistrationDTO registrationDTO) {

    }

    @Override
    public RegistrationDTO findEmailAndPassword(String s, String s1) {
        return null;
    }

    @Override
    public boolean findUser(String s) {
        return false;
    }

    @Override
    public RegistrationDTO findNic(String s) {
        return null;
    }
}
