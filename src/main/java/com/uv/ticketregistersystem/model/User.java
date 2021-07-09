package com.uv.ticketregistersystem.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Entity
@Getter
@Setter
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "email") })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;
	
	private boolean status = true;

	private String firstName;

	private String middleName;

	private String surname;

	private String address;

	private String identificationNumber;

	private String phoneNumber;

	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User(String email, String password, String firstName, String middleName, String surname, String address,
			String identificationNumber, String phoneNumber) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = surname;
		this.address = address;
		this.identificationNumber = identificationNumber;
		this.phoneNumber = phoneNumber;

	}
}
