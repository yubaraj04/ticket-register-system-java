package com.uv.ticketregistersystem.Payment;

import com.uv.ticketregistersystem.ticketRegistration.TicketRegistration;
import com.uv.ticketregistersystem.ticketRegistration.TicketRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private PaymentRepository repository;

    @Autowired
    private TicketRegistrationService ticketRegistrationService;

    @Override
    public ResponseEntity<String> save(Payment payment) {
        if(payment !=null){
            TicketRegistration registration = ticketRegistrationService.findByReferenceNumber(payment.getReferenceNumber());
            try{
                if(registration.isPaymentMade()){
                    return ResponseEntity.badRequest().body("Payment Made Already.");
                }
                registration.setPaymentMade(true);
                registration.getPayment().setPaymentMode(payment.getPaymentMode());
                registration.getPayment().setPaidAmount(payment.getPaidAmount());
                registration.getPayment().setReferenceNumber(payment.getReferenceNumber());
                ticketRegistrationService.save(registration);
                return ResponseEntity.ok().body("Payment Made Succesfully.");
            }catch (Exception e){
            e.printStackTrace();
            }
        }
        return ResponseEntity.badRequest().body("Faield.");
    }
}
