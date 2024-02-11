package com.kpjjohor.healthcare.repository;

import com.kpjjohor.healthcare.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(UserRoleEnum name);
}
