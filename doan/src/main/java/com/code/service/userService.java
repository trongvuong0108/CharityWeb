package com.code.service;

import java.util.List;

import com.code.model.User;

public interface userService {
	public List<User> getAll();
	public User getUserbyUserName(String s);
	public void addUser(User user);
	public List<User> findByStatus(boolean status);
}
