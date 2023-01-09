package com.code.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.phieudk;
import com.code.service.phieudkService;
import com.code.repository.*;

@Service
public class phieudkServiceImpl implements phieudkService{

	@Autowired
	private phieudkRepository phieudkRepository; 
	
	@Override
	public void save(phieudk phieudk) {
		phieudkRepository.save(phieudk);
	}

	@Override
	public List<phieudk> getAll() {
		return phieudkRepository.findAll();
	}
	
}
