package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,String > {
}
