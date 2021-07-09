package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketRegistrationRepository extends JpaRepository<TicketRegistration,Long> {
    Optional<TicketRegistration> findByReferenceNumber(String referenceNumber);

    @Query("select max(referenceNumber) from TicketRegistration ")
    String findMaxReferenceNumber();
}
