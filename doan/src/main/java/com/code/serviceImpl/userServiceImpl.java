package com.code.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.code.model.User;
import com.code.repository.userRepository;
import com.code.service.userService;

@Service
public class userServiceImpl implements userService{
	@Autowired 
	private userRepository userRepository;
	@Override
	public User getUserbyUserName(String s) throws UsernameNotFoundException {
		return userRepository.findByEmail(s);
	}
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}
	@Override
	public List<User> findByStatus(boolean status) {
		return userRepository.findAllByStatus(status);
	}

}
