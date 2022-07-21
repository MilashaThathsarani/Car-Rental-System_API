package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    public void updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getCustomerId())) {
            customerRepo.save(modelMapper.map(dto,Customer.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    public CustomerDTO searchCustomer(String id) {
        if (customerRepo.existsById(id)){
            return modelMapper.map(customerRepo.findById(id).get(), CustomerDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<CustomerDTO>>(){
        }.getType());
    }

    @Override
    public boolean findCustomerByUsername(String username) {
        return false;
    }

    @Override
    public boolean findCustomerByPassword(String password) {
        return false;
    }

    @Override
    public CustomerDTO findCustomerByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public String generateCustomerId() {
        return null;
    }

    @Override
    public void updateCustomerStatus(String id) {

    }

    @Override
    public List<CustomerDTO> getAllPendingCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllAcceptedCustomers() {
        return null;
    }

    @Override
    public void uploadCustomerImages(String nicFrontImg, String nicBackImg, String licenceImgPath, String id) {

    }

    @Override
    public int getCountOfCustomersRegistered() {
        return 0;
    }
}
