package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.Role;
import com.kpjjohor.healthcare.model.UserRoleEnum; // Adjust this import statement

public interface RoleService {

    Role findByName(UserRoleEnum name);
}
