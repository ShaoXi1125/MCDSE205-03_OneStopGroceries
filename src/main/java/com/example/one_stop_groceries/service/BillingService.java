package com.example.one_stop_groceries.service;

import org.springframework.stereotype.Service;
import com.example.one_stop_groceries.processor.PaymentProcessor;
import com.example.one_stop_groceries.processor.PaymentProcessorFactory;

@Service
public class BillingService {
    private final PaymentProcessorFactory paymentProcessorFactory;

    public BillingService(PaymentProcessorFactory paymentProcessorFactory) {
        this.paymentProcessorFactory = paymentProcessorFactory;
    }

    public boolean completePayment(String mode) {
        PaymentProcessor processor = paymentProcessorFactory.getPaymentProcessor(mode);
        if (processor != null) {
            return processor.process();
        } else {
            throw new IllegalArgumentException("Invalid payment mode: " + mode);
        }
    }
}
