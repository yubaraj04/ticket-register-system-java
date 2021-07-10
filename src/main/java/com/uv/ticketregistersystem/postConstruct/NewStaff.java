
package com.uv.ticketregistersystem.postConstruct;

import com.uv.ticketregistersystem.authenticationAndUser.model.User;
import com.uv.ticketregistersystem.authenticationAndUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class NewStaff {
	@Autowired
	UserRepository userRepo;
	@Autowired
	PasswordEncoder encoder;

	@javax.annotation.PostConstruct
	public void saveUser() {
		if(userRepo.findAll().size()<1){
			User user = new User();
			user.setEmail("test@gmail.com");
			user.setPassword(encoder.encode("admin"));
			user.setFirstName("Test");
			user.setMiddleName("");
			user.setStatus(true);
			user.setSurname("Foo");
			user.setAddress("Mulpani, Kathmandu");
			user.setIdentificationNumber("User001");
			userRepo.save(user);
		}


	}
	

}

