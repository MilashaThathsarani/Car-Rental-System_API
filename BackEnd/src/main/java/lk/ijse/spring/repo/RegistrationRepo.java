package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationRepo extends JpaRepository<Registration,String > {
    Optional<Registration> findByEmailAndPassword(String email, String password);

    boolean existsByEmail(String email);

    Optional<Registration> findByNic(String nic);
}
