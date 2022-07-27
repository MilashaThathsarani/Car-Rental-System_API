package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Optional<Customer> findByEmailAndPassword(String email, String password);

    boolean existsByEmail(String email);

    Optional<Customer> findByNic(String nic);

}
