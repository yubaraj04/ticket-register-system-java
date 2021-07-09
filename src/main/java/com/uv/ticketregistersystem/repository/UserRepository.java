package com.uv.ticketregistersystem.repository;

import com.uv.ticketregistersystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String username);

	Boolean existsByEmail(String email);
	
	@Query("SELECT u from User u where u.status=true")
	List<User> findAll();

}
