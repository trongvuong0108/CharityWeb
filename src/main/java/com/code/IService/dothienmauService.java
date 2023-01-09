package com.code.IService;

import java.util.List;

import com.code.Entity.dothienmau;

public interface dothienmauService {
	public List <dothienmau> getAll();
	public void saveDothienmau(dothienmau dothienmau);
	public dothienmau getById(int id);
	public void deleteDothienmau(int id);
}
