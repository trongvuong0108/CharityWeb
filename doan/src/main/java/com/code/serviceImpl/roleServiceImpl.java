package com.code.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.role;
import com.code.repository.roleRepository;
import com.code.service.roleService;

@Service
public class roleServiceImpl implements roleService {
	@Autowired
	private roleRepository roleRepository;
	@Override
	public role getByName(String s) {
		return roleRepository.findByName(s);
	}

}
