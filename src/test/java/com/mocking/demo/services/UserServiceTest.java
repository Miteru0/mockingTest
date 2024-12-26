package com.mocking.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mocking.demo.entities.User;
import com.mocking.demo.repositories.UserRepository;

@SpringBootTest
public class UserServiceTest {

    // @Autowired
    // private UserService userService;

    // @Autowired
    // private UserRepository userRepository;

    // @BeforeEach
    // public void setUp() {
    //     userRepository.deleteAll();
    // }

    // @Test
    // public void testCreateUser() {
    //     User user = new User();
    //     user.setUsername("realuser");
    //     user.setPassword("password");

    //     User savedUser = userService.createUser(user);

    //     assertNotNull(savedUser.getId());
    //     assertEquals("realuser", savedUser.getUsername());
    // }

    // @Test
    // public void testFindUser() {
    //     User user = new User();
    //     user.setUsername("realuser");
    //     user.setPassword("password");
    //     User savedUser = userService.createUser(user);

    //     User foundUser = userService.findUser(savedUser.getId());

    //     assertNotNull(foundUser);
    //     assertEquals("realuser", foundUser.getUsername());
    // }

}
