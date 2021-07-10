package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Optional;

public interface TicketRegistrationRepository extends JpaRepository<TicketRegistration,Long> {
    Optional<TicketRegistration> findByReferenceNumber(String referenceNumber);

    @Query("select max(referenceNumber) from TicketRegistration ")
    String findMaxReferenceNumber();

    @Query("select sum(numberOfPassenger) from TicketRegistration t where t.createdAt=:date")
    int getDailyTotalSeat(LocalDate date);

    @Query("select sum(totalAmount) from TicketRegistration t where t.paymentMade=:status")
    double getSumByStatus(boolean status);
}
