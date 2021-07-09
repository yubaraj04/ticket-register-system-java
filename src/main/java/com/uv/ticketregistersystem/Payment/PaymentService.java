package com.uv.ticketregistersystem.Payment;

import org.springframework.http.ResponseEntity;

public interface PaymentService {
    ResponseEntity<String> save(Payment payment);
}
