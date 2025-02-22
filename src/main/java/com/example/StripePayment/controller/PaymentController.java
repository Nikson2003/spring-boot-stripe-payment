package com.example.StripePayment.controller;

import com.example.StripePayment.model.PaymentRequest;
import com.example.StripePayment.model.PaymentResponse;
import com.example.StripePayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public PaymentResponse createPayment(@RequestBody PaymentRequest request) {
        return paymentService.createPaymentIntent(request);
    }
}
