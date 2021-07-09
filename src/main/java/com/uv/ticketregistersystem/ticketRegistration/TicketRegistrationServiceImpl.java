package com.uv.ticketregistersystem.ticketRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketRegistrationServiceImpl implements TicketRegistrationService{
    @Autowired
    private TicketRegistrationRepository repository;

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

    @Override
    public boolean checkForPayment(String referenceNumber) {
    return false;
    }

    @Override
    public ResponseEntity<String> generateReferenceNumber() {
        String max = repository.findMaxReferenceNumber();
        String referenceNumber="REF-001";
        if(max !=null){
            String[] arr= max.split("-");
            int num=Integer.valueOf(arr[1])+1;
            if(num<10)
            referenceNumber="REF-00"+num;
            else if(num<100)
                referenceNumber="REF-0"+num;
            else
                referenceNumber="REF-"+num;
        }
        return ResponseEntity.ok().body(referenceNumber);
    }
}
