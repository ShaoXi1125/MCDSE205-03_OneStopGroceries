package com.example.one_stop_groceries.service;

import com.example.one_stop_groceries.processor.PaymentProcessor;

public class BillingService {
    private PaymentProcessor paymentProcessor;

    // Constructor-based Dependency Injection
    public BillingService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean completePayment() {
        return paymentProcessor.process();
    }
}
