package lk.ijse.spring.service;

import lk.ijse.spring.dto.RegistrationDTO;

import java.util.ArrayList;

public interface RegistrationService {
    public void saveRegistration(RegistrationDTO registrationDTO);

    public void deleteRegistration(String s);

    RegistrationDTO searchRegistration(String s);

    ArrayList<RegistrationDTO> getAllRegistrations();

    public void updateRegistration(RegistrationDTO registrationDTO);

    RegistrationDTO findEmailAndPassword(String s, String s1);

    boolean findUser(String s);

    RegistrationDTO findNic(String s);
}
