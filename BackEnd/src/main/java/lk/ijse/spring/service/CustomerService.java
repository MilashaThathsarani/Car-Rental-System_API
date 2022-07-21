package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDTO dto);

    public void deleteCustomer(String id);

    public void updateCustomer(CustomerDTO dto);

    public CustomerDTO searchCustomer(String id);

    public List<CustomerDTO> getAllCustomers();

    boolean findCustomerByUsername(String username);

    boolean findCustomerByPassword(String password);

    CustomerDTO findCustomerByUsernameAndPassword(String username, String password);

    String generateCustomerId();

    void updateCustomerStatus(String id);

    List<CustomerDTO> getAllPendingCustomers();

    List<CustomerDTO> getAllAcceptedCustomers();

    void uploadCustomerImages(String nicFrontImg, String nicBackImg, String licenceImgPath, String id);

    int getCountOfCustomersRegistered();
}
