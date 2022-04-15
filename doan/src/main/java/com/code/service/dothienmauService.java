package com.code.service;

import java.util.List;

import com.code.model.dothienmau;

public interface dothienmauService {
	public List <dothienmau> getAll();
	public void saveDothienmau(dothienmau dothienmau);
	public dothienmau getById(int id);
	public void deleteDothienmau(int id);
}
