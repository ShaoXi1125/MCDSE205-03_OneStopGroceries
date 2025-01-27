package com.example.one_stop_groceries.processor;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean process() {
        // Process Credit Card payment
        System.out.println("Processing payment with Credit Card...");
        return true;
    }
}
