package com.example.StripePayment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class StripeConfig {
    
    @Value("${stripe.secret.key}")
    private String secretKey;

    @PostConstruct
    public void validateConfig() {
        if (secretKey == null || secretKey.isBlank()) {
            throw new IllegalStateException("Stripe Secret Key is not configured properly.");
        }
    }

    public String getSecretKey() {
        return secretKey;
    }
}
