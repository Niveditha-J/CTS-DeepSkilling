package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/check/{productId}")
    public String checkStock(@PathVariable Long productId) {
        return "Stock available for Product ID: " + productId;
    }
}
