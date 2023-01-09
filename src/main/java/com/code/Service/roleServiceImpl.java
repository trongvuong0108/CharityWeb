package com.code.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.role;
import com.code.Repository.roleRepository;
import com.code.IService.roleService;

@Service
public class roleServiceImpl implements roleService {
	@Autowired
	private roleRepository roleRepository;
	@Override
	public role getByName(String s) {
		return roleRepository.findByName(s);
	}

}
