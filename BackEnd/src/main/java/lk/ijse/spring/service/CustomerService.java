package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDTO customerDTO);

    public void updateCustomer(CustomerDTO customerDTO);

    public void deleteCustomer(String id);

    public CustomerDTO searchCustomer(String id);

    public List<CustomerDTO> getAllCustomers();
}
