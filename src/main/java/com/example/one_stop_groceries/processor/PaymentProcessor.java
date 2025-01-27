package com.example.one_stop_groceries.processor;

public interface PaymentProcessor {
    boolean process(); // Returns true when payment is successful
}
