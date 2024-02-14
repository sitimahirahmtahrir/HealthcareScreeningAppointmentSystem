package com.kpjjohor.healthcare.service.impl;

import com.kpjjohor.healthcare.model.User;
import com.kpjjohor.healthcare.repository.UserRepository;
import com.kpjjohor.healthcare.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerUser(User user) {
        // Encode the password before saving the user
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user to the database
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        // Implement the logic to find a user by username
        // This method is declared in the UserService interface
        // You need to provide the actual implementation
        return userRepository.findByUsername(username);
    }

    @SuppressWarnings("null")
	@Override
    public void saveUser(User user) {
        // Implement the logic to save a user
        // This method is declared in the UserService interface
        // You need to provide the actual implementation
        userRepository.save(user);
    }

    // Other methods...

}
