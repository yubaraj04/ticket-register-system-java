package com.uv.ticketregistersystem.ticketRegistration;

import com.uv.ticketregistersystem.Payment.Payment;
import com.uv.ticketregistersystem.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
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
    private boolean paymentMade=false;

    @OneToOne(mappedBy="ticketRegistration", cascade= CascadeType.ALL)
    private Payment payment;
    
}
