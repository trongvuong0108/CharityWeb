package com.code.IService;

import java.util.List;

import com.code.Entity.baidang;

public interface postService {
	public List <baidang> getAll();
	public void savePost(baidang post ,int dothienmauId , int diadiemId);
	public baidang getById(int id);
	public void deletePost(int id);
}
