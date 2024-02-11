package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.Role;
import com.kpjjohor.healthcare.model.User;

public interface UserRoleService {

    void addUserRole(User user, Role role);
}
