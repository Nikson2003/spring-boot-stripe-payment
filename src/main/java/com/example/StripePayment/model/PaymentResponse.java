package com.example.StripePayment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentResponse {
    
    @JsonProperty("client_secret")
    private String clientSecret;

    public PaymentResponse(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
