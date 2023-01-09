package com.code.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.dothienmau;
import com.code.repository.dothienmauRepository;
import com.code.service.dothienmauService;
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
