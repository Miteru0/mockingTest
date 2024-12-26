package com.mocking.demo.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserRepositoryTest {


    @Test
    public void TestController() {
        String first = "yes";
        assertEquals("yes", first, "Yes");
    }

    @Test
    public void TestController2() {
        String first = "no";
        assertEquals("no", first, "No");
    }
}
