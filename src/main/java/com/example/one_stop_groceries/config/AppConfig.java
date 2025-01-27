package com.example.one_stop_groceries.config;

import com.example.one_stop_groceries.processor.GooglePayProcessor;
import com.example.one_stop_groceries.processor.PaymentProcessor;
import com.example.one_stop_groceries.service.BillingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentProcessor paymentProcessor() {
        return new GooglePayProcessor(); // Default to Google Pay
    }

    @Bean
    public BillingService billingService(PaymentProcessor paymentProcessor) {
        return new BillingService(paymentProcessor);
    }
}
