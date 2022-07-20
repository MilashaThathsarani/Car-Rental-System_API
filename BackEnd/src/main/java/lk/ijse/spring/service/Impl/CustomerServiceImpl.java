package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public void saveCustomer(CustomerDTO dto) {
        if (!customerRepo.existsById(dto.getCustomerId())) {
            //Customer entity = modelMapper.map(dto, Customer.class);
            customerRepo.save(modelMapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    public void deleteCustomer(String id) {

    }

    public void updateCustomer(CustomerDTO entity) {

    }

    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    public List<CustomerDTO> getAllCustomers() {
        return null;
    }
}
