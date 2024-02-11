package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.User;

public interface UserService {

    void saveUser(User user);

    User findByUsername(String username);
}
