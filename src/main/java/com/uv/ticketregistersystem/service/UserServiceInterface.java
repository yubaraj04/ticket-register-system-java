package com.uv.ticketregistersystem.service;

import com.uv.ticketregistersystem.model.User;
import com.uv.ticketregistersystem.requestandresponse.SignupRequest;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

	public ResponseEntity<?> registerUser(SignupRequest signUpRequest);
	public Optional<User> findById(Long id);
	public List<User> findAll();
	//public ResponseEntity<String> update(Long id, User user);
	//public ResponseEntity<String> delete(Long id);
	//public List<UserDto> findAllActiveUsers();
	//ResponseEntity<?> resetPassword(String oldPwd, String password);
	//String getCurrentUserFirstLetters();

    ResponseEntity<String> forgotPassword(HttpServletRequest request, String mailId);
	public String verifyCode(String email, String code);
}
