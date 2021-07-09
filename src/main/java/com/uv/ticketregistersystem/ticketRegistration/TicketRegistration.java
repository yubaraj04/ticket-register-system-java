package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class TicketRegistration extends BaseEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String age;
    private String destinationFrom;
    private String destinationTo;
    private String airline;
    private Date flightDate;
    private String departureTime;
    private int numberOfPassenger;
    private double totalAmount;
    private String referenceNumber;
    
}
