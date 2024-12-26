package com.mocking.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {


    @GetMapping("/test")
    public String testing() {
        return "Hello, it all works!";
    }

    @GetMapping("/test2")
    public String testing2() {
        return "Hello, it all still works!";
    }
    

}
