package com.code.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.maxacnhan;
import com.code.repository.maxacnhanRepository;
import com.code.service.maxacnhanService;

@Service
public class maxacnhanImpl implements maxacnhanService{

	@Autowired
	private maxacnhanRepository maxacnhanRepository;
	
	@Override
	public void newMa(maxacnhan maxacnhan) {
		maxacnhanRepository.save(maxacnhan);
	}

}
