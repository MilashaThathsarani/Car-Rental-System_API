package lk.ijse.spring.repo;

import lk.ijse.spring.entity.VehicleRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRentRepo extends JpaRepository<VehicleRent,String > {
}
