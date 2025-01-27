package com.example.one_stop_groceries.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.one_stop_groceries.service.BillingService;

@RestController
public class BillingController {
    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/billing/payment")
    public String testPayment(@RequestParam String mode) {
        try {
            boolean result = billingService.completePayment(mode);
            return result ? "Payment successful using " + mode + "!" : "Payment failed!";
        } catch (IllegalArgumentException e) {
            return e.getMessage(); // Return the error message for invalid modes
        }
    }
}
