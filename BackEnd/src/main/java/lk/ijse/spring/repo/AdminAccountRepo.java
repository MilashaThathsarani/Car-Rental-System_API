package lk.ijse.spring.repo;

import lk.ijse.spring.entity.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepo extends JpaRepository<AdminAccount,String> {
}
