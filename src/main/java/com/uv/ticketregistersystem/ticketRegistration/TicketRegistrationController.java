package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.Constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.BASE_URL+"ticketRegisteration/")
public class TicketRegistrationController {

    @Autowired
    private TicketRegistrationService service;

    @PostMapping("save")
    public ResponseEntity<String> save(@RequestBody TicketRegistration registration){
        return service.save(registration);
    }
    @GetMapping("findAll")
    public List<TicketRegistration> findAll(){
        return service.findAll();
    }
    @GetMapping("findById/{id}")
    public TicketRegistration findById(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("findByReferenceNumber/{referenceNumber}")
    public TicketRegistration findByReferenceNumber(@PathVariable String referenceNumber){
        return service.findByReferenceNumber(referenceNumber);
    }
}
