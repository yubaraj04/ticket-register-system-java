package com.uv.ticketregistersystem.payment;

import com.uv.ticketregistersystem.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(Constants.BASE_URL+"payment/")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Payment payment){
        return service.save(payment);
    }
}
