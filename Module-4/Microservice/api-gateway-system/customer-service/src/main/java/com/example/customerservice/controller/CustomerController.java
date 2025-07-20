package com.example.customerservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Customer Service!";
    }
}
