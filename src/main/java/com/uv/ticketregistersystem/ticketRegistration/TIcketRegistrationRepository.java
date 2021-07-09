package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TIcketRegistrationRepository extends JpaRepository<TicketRegistration,Long> {
    Optional<TicketRegistration> findByReferenceNumber(String referenceNumber);
}
