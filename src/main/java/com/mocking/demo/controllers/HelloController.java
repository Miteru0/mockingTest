package com.mocking.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String testing() {
        return "Hello, it all works!";
    }

    @GetMapping("/test2")
    public String testing2() {
        return "Hello, it all still works!";
    }
    
    @GetMapping("/test3")
    public String testing3() {
        return "Hello, it doesn't work anymore... ";
    }

    @GetMapping("/test4")
    public String testing4() {
        return "Hello, jk. It still works ";
    }

}
