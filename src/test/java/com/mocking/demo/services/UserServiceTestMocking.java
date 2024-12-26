package com.mocking.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mocking.demo.entities.User;
import com.mocking.demo.repositories.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTestMocking {
    @Mock
    private UserRepository userRepository; // Mock dependency

    private UserService userService; // Class under test

    @BeforeEach
    void setUp() {
        // Manually inject the mock into the constructor
        userService = new UserService(userRepository);
    }

    @Test
    void testCreateUser() {
        // Arrange
        User user = new User();
        user.setId("1");
        user.setUsername("John");
        user.setPassword("Doe");

        when(userRepository.save(user)).thenReturn(user);

        // Act
        User createdUser = userService.createUser(user);

        // Assert
        assertEquals(user, createdUser);
        verify(userRepository, times(1)).save(user); // Verify save was called once
    }

    @Test
    void testFindUser() {
        // Arrange
        User user = new User();
        user.setId("1");
        user.setUsername("John");
        user.setPassword("Doe");
        when(userRepository.findById("1")).thenReturn(Optional.of(user));

        // Act
        Optional<User> foundUser = Optional.of(userService.findUser("1"));

        // Assert
        assertEquals(Optional.of(user), foundUser);
        verify(userRepository, times(1)).findById("1"); // Verify findById was called once
    }
}
