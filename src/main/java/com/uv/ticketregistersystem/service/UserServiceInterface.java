package com.uv.ticketregistersystem.service;

import com.uv.ticketregistersystem.model.User;
import com.uv.ticketregistersystem.requestandresponse.SignupRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

	public ResponseEntity<?> registerUser(SignupRequest signUpRequest);
	public Optional<User> findById(Long id);
	public List<User> findAll();

}
