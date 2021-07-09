package com.uv.ticketregistersystem.service;

import com.uv.ticketregistersystem.model.Authorization;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuthorizationService {
	public Object getValues();
	public Object findById(Long id);
	public ResponseEntity<String> update(List<Authorization> authorizations);
}
