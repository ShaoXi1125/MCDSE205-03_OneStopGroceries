package com.example.one_stop_groceries.test;

import com.example.one_stop_groceries.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.one_stop_groceries.service.BillingService;

public class Main {
    public static void main(String[] args) {
        // Initialize the Spring Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the BillingService bean
        BillingService billingService = context.getBean(BillingService.class);

        // Test completePayment() method
        boolean result = billingService.completePayment();
        System.out.println("Payment Successful: " + result);
    }
}
