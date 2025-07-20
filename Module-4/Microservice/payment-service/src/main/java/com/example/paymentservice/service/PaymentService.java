package com.example.paymentservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);
    private static final String CIRCUIT_BREAKER_NAME = "paymentServiceCB";

    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackResponse")
    public String callExternalApi() {
        simulateDelay();
        logger.info("Calling third-party payment API...");
        return "Payment successful!";
    }

    public String fallbackResponse(Throwable t) {
        logger.warn("Fallback method triggered: {}", t.getMessage());
        return "Payment failed temporarily. Please try again later.";
    }

    private void simulateDelay() {
        try {
            int delay = new Random().nextInt(3000) + 2000; // 2–5 sec delay
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
