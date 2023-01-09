package com.code.IService;

import java.util.List;

import com.code.Entity.diadiem;

public interface diadiemService {
	public List <diadiem> getAll();
	public void saveDiadiem(diadiem diadiem);
	public diadiem getById(int id);
	public void deleteDiadiem(int id);
}
