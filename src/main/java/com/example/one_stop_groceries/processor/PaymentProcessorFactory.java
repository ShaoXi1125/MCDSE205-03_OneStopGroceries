package com.example.one_stop_groceries.processor;

public class PaymentProcessorFactory {
    private final GooglePayProcessor googlePayProcessor = new GooglePayProcessor();
    private final CreditCardProcessor creditCardProcessor = new CreditCardProcessor();

    public PaymentProcessor getPaymentProcessor(String mode) {
        if ("gpay".equalsIgnoreCase(mode)) {
            return googlePayProcessor;
        } else if ("credit_card".equalsIgnoreCase(mode)) {
            return creditCardProcessor;
        }
        return null; // Return null for invalid modes (or throw an exception if preferred)
    }
}
