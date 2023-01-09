package com.code.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.phieudk;
import com.code.IService.phieudkService;
import com.code.Repository.*;

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
