package com.mocking.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {

    @Test
    public void TestController() {
        String first = "yes";
        assertEquals("yes", first);
    }

    @Test
    public void TestController2() {
        String first = "yes";
        assertEquals("yes", first);
    }
}
