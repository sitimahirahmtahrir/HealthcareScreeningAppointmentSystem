package com.kpjjohor.healthcare.repository;

import com.kpjjohor.healthcare.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    // You can add custom query methods if needed
}
