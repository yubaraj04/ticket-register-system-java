package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TicketRegistrationService {
    ResponseEntity<String> save(TicketRegistration registration);

    TicketRegistration findById(Long id);

    List<TicketRegistration> findAll();

    TicketRegistration findByReferenceNumber(String referenceNumber);
}
