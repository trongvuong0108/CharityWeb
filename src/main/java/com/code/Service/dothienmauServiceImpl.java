package com.code.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.dothienmau;
import com.code.Repository.dothienmauRepository;
import com.code.IService.dothienmauService;
@Service
public class dothienmauServiceImpl implements dothienmauService {
	@Autowired
	private dothienmauRepository dothienmauRepository ; 
	@Override
	public List<dothienmau> getAll() {
		return dothienmauRepository.findAll();
	}

	@Override
	public void saveDothienmau(dothienmau dothienmau) {
		dothienmauRepository.save(dothienmau);
		
	}

	@Override
	public dothienmau getById(int id) {
		return dothienmauRepository.findById(id).get();
	}

	@Override
	public void deleteDothienmau(int id) {
		dothienmauRepository.deleteById(id);
		
	}

}
