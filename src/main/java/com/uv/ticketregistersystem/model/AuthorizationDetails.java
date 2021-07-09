package com.uv.ticketregistersystem.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class AuthorizationDetails extends BaseEntity{
	private Long employeeId;
	@ManyToOne
	@JsonIgnore
	private Authorization authorization;
}
