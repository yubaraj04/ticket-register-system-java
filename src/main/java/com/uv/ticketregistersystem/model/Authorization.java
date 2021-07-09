package com.uv.ticketregistersystem.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Authorization extends BaseEntity{
	private String type;
	private String authority;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="authorization_id")
	private Set<AuthorizationDetails> authorizationDetails;	
	
	private String createdBy;
	private String updatedBy;
}
