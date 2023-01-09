package com.code.IService;

import java.util.List;

import com.code.Entity.User;

public interface userService {
	public List<User> getAll();
	public User getUserbyUserName(String s);
	public void addUser(User user);
	public List<User> findByStatus(boolean status);
}
