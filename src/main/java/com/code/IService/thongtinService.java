package com.code.IService;

import java.util.List;

import com.code.Entity.thongtin;

public interface thongtinService {
	public List<thongtin> getAll();
	public void save(thongtin thongtin);
	public thongtin findAllByEmail(String email);
}
