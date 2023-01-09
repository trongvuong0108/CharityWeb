package com.code.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.diadiem;
import com.code.Repository.diadiemRepository;
import com.code.IService.diadiemService;
@Service
public class diadiemServiceImpl implements diadiemService {
	
	@Autowired
	private diadiemRepository diadiemRepository ; 
	@Override
	public List<diadiem> getAll() {
		// TODO Auto-generated method stub
		return diadiemRepository.findAll();
	}

	@Override
	public void saveDiadiem(diadiem diadiem) {
		diadiemRepository.save(diadiem);
		
	}

	@Override
	public diadiem getById(int id) {
		return diadiemRepository.findById(id).get();
	}

	@Override
	public void deleteDiadiem(int id) {
		diadiemRepository.deleteById(id);
		
	}

}
