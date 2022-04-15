package com.code.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.code.model.User;

public interface userDetailsService extends UserDetailsService {
	public User getUserbyUserName(String s);
}
