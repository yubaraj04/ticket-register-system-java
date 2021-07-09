package com.uv.ticketregistersystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
