package com.code.service;

import java.util.List;

import com.code.model.baidang;

public interface postService {
	public List <baidang> getAll();
	public void savePost(baidang post ,int dothienmauId , int diadiemId);
	public baidang getById(int id);
	public void deletePost(int id);
}
