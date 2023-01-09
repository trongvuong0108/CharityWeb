package com.code.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.thongtin;
import com.code.Repository.thongtinRepository;
import com.code.IService.thongtinService;

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
