package com.uv.ticketregistersystem.payment;

import org.springframework.http.ResponseEntity;

public interface PaymentService {
    ResponseEntity<String> save(Payment payment);
}
