package com.uv.ticketregistersystem.Payment;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.uv.ticketregistersystem.model.BaseEntity;
import com.uv.ticketregistersystem.ticketRegistration.TicketRegistration;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Payment extends BaseEntity {
    private String referenceNumber;
    private double paidAmount;
    private String paymentMode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable=false)
    @JsonBackReference
    private TicketRegistration ticketRegistration;
}
