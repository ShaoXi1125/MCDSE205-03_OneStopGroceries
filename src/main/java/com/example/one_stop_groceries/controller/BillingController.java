package com.example.one_stop_groceries.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.one_stop_groceries.service.BillingService;

@RestController
@RequestMapping("/billing") // Base path for all billing-related endpoints
public class BillingController {
    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/payment") // Endpoint: /billing/payment
    public String testPayment() {
        boolean result = billingService.completePayment();
        return result ? "Payment successful!" : "Payment failed!";
    }
}
