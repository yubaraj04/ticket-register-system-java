package com.uv.ticketregistersystem.authenticationAndUser.requestandresponse;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
 
@Getter @Setter
public class SignupRequest {
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
 
    private String firstName;

	private String middleName;

	private String surname;
	
	private String address;
	
	private String identificationNumber;
	
	private String phoneNumber;
	
	private String position;
		
	private String department;
	
	private Set<String> role;	
}
