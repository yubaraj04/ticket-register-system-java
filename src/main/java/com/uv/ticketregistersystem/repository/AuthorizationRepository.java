package com.uv.ticketregistersystem.repository;

import com.uv.ticketregistersystem.model.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AuthorizationRepository extends JpaRepository<Authorization, Long> {
	List<Authorization> findByType(String type);
	Optional<Authorization> findByTypeAndAuthority(String type, String authority);
	Optional<Authorization> findByTypeAndAuthorityAndAuthorizationDetails_EmployeeId(String type, String authority, int id);
	boolean existsByTypeAndAuthorityAndAuthorizationDetails_EmployeeId(String type, String authority, int id);
}
