package com.code.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.maxacnhan;
import com.code.Repository.maxacnhanRepository;
import com.code.IService.maxacnhanService;

@Service
public class maxacnhanImpl implements maxacnhanService{

	@Autowired
	private maxacnhanRepository maxacnhanRepository;
	
	@Override
	public void newMa(maxacnhan maxacnhan) {
		maxacnhanRepository.save(maxacnhan);
	}

}
