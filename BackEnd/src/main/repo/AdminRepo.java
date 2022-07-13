package main.repo;

import main.entity.Admin;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, String> {
    Optional<Admin> findAdminByUsername(String username);
    Optional<Admin> findAdminByPassword(String password);

    @Query(value = "SELECT adminId FROM Admin ORDER BY adminId DESC LIMIT 1",nativeQuery = true)
    String generateAdminId();
}

