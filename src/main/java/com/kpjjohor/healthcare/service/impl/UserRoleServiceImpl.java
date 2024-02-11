package com.kpjjohor.healthcare.service.impl;

import org.springframework.stereotype.Service;

import com.kpjjohor.healthcare.model.Role;
import com.kpjjohor.healthcare.model.User;
import com.kpjjohor.healthcare.model.UserRole;
import com.kpjjohor.healthcare.repository.UserRoleRepository;
import com.kpjjohor.healthcare.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void addUserRole(User user, Role role) {
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        userRoleRepository.save(userRole);
    }

    // Implement other methods declared in UserRoleService if any
}
