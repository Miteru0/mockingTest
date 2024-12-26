package com.mocking.demo.services;

import com.mocking.demo.entities.User;
import com.mocking.demo.repositories.UserRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findUser(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}