package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketRegistrationServiceImpl implements TicketRegistrationService{
    @Autowired
    private TIcketRegistrationRepository repository;

    @Override
    public ResponseEntity<String> save(TicketRegistration registration) {
        try{
            repository.save(registration);
            return ResponseEntity.ok().body("Registered Successfully.");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Failed To Register.");
        }
    }

    @Override
    public TicketRegistration findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<TicketRegistration> findAll() {
        return repository.findAll();
    }

    @Override
    public TicketRegistration findByReferenceNumber(String referenceNumber) {
      return repository.findByReferenceNumber(referenceNumber).get();
    }
}
