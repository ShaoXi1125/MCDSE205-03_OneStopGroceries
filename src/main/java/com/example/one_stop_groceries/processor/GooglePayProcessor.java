package com.example.one_stop_groceries.processor;

public class GooglePayProcessor implements PaymentProcessor {
    @Override
    public boolean process() {
        System.out.println("Processing payment with Google Pay...");
        return true; // Simulating successful payment
    }
}
