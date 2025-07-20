package com.nive.gatewayresilience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayResilienceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayResilienceApplication.class, args);
    }

    // fallback endpoint
    @GetMapping("/fallback")
    public String fallback() {
        return "This is a fallback response";
    }
}
