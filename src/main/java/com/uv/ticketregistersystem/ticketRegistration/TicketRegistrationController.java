package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.utility.Constants;
import com.uv.ticketregistersystem.dtos.BarChart;
import com.uv.ticketregistersystem.dtos.LineChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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

    @GetMapping("generateReferenceNumber")
    public Object generateReferenceNumber(){
        return service.generateReferenceNumber();
    }

    @GetMapping("getTotalRegistrationData")
    public List<LineChart> getTotalSeatData(){
        /*for dashboard*/
        return service.getTotalSeatData();
    }

    @GetMapping("getReceivedVsPending")
    public List<BarChart> getReceivedVsPending(){
        /*for dashboard*/
        return service.getReceivedVsPending();
    }


}
