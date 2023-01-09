package com.code.IService;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.code.Entity.User;

public interface userDetailsService extends UserDetailsService {
	public User getUserbyUserName(String s);
}
