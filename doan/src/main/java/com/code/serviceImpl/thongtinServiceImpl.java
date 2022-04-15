package com.code.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.thongtin;
import com.code.repository.thongtinRepository;
import com.code.service.thongtinService;

@Service
public class thongtinServiceImpl implements thongtinService {

	@Autowired
	private thongtinRepository thongtinRepository;
	
	@Override
	public List<thongtin> getAll() {
		return thongtinRepository.findAll();
	}

	@Override
	public void save(thongtin thongtin) {
		thongtinRepository.save(thongtin);
		
	}

	@Override
	public thongtin findAllByEmail(String email) {
		return thongtinRepository.findByEmail(email);
	}

}
