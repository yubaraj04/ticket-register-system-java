package com.uv.ticketregistersystem.authenticationAndUser.service;

import com.uv.ticketregistersystem.authenticationAndUser.model.User;
import com.uv.ticketregistersystem.authenticationAndUser.requestandresponse.SignupRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

	public ResponseEntity<?> registerUser(SignupRequest signUpRequest);
	public Optional<User> findById(Long id);
	public List<User> findAll();

}
