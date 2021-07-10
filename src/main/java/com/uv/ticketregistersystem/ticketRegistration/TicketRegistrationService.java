package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.dtos.LineChart;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface TicketRegistrationService {
    ResponseEntity<String> save(TicketRegistration registration);

    TicketRegistration findById(Long id);

    List<TicketRegistration> findAll();

    TicketRegistration findByReferenceNumber(String referenceNumber);

    boolean checkForPayment(String referenceNumber);

    Object generateReferenceNumber();

    List<LineChart> getTotalSeatData();
}
