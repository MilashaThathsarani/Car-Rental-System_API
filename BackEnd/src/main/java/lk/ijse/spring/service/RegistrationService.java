package lk.ijse.spring.service;

import lk.ijse.spring.dto.RegistrationDTO;

import java.util.ArrayList;

public interface RegistrationService {
    public void saveRegistration(RegistrationDTO registrationDTO);

    public void updateRegistration(RegistrationDTO registrationDTO);

    public void deleteRegistration(String id);

    RegistrationDTO searchRegistration(String id);

    ArrayList<RegistrationDTO> getAllRegistrations();

    RegistrationDTO findEmailAndPassword(String s, String s1);

    boolean findUser(String id);

    RegistrationDTO findNic(String id);
}
