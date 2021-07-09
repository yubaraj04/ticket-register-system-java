package com.uv.ticketregistersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class TicketRegisterSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketRegisterSystemApplication.class, args);
	}

}
