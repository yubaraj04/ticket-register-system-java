package com.uv.ticketregistersystem.securityConfigAndutils;

import com.uv.ticketregistersystem.userDetailsService.UserDetailsImpl;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

	public String getUserEmail() {
		UserDetailsImpl details = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return details.getEmail();
	}

	public String getUserFirstName() {
		UserDetailsImpl details = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return details.getFirstName();
	}

	public String getUserMiddleName() {
		UserDetailsImpl details = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return details.getMiddleName();
	}

	public String getSurName() {
		UserDetailsImpl details = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return details.getLastName();
	}

	public Long getUserId() {
		UserDetailsImpl detail = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return detail.getId();
	}

	public Collection<? extends GrantedAuthority> getUserRole() {
		UserDetailsImpl detail = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return detail.getAuthorities();
	}
}
