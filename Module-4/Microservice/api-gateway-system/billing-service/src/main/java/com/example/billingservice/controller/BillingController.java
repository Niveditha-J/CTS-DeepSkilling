package com.example.billingservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @GetMapping("/pay")
    public String processPayment() {
        return "Billing Service: Payment processed successfully!";
    }
}
