package com.code.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Entity.baidang;
import com.code.Repository.diadiemRepository;
import com.code.Repository.dothienmauRepository;
import com.code.Repository.postRepository;
import com.code.IService.postService;
@Service
public class postServiceImpl implements postService {
	
	@Autowired
	private postRepository postRepository ;
	
	@Autowired 
	private diadiemRepository diadiemRepository;
	
	@Autowired
	private dothienmauRepository dothienmauRepository ;
	
	@Override
	public List<baidang> getAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public void savePost(baidang baidang,int dothienmauId, int diadiemId) {
		baidang.setDothienmau(dothienmauRepository.findById(dothienmauId).get());
		baidang.setDiadiem(diadiemRepository.findById(diadiemId).get());
		postRepository.save(baidang);
	}

	@Override
	public baidang getById(int id) {
		return postRepository.findById(id).get();
	}

	@Override
	public void deletePost(int id) {
		postRepository.deleteById(id);
	}

}
