package com.code.service;

import java.util.List;

import com.code.model.diadiem;

public interface diadiemService {
	public List <diadiem> getAll();
	public void saveDiadiem(diadiem diadiem);
	public diadiem getById(int id);
	public void deleteDiadiem(int id);
}
