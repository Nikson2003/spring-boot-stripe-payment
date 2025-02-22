package com.example.StripePayment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequest {
    
    @JsonProperty("amount")
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
