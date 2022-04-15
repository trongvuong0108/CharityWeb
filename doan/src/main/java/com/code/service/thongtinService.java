package com.code.service;

import java.util.List;

import com.code.model.thongtin;

public interface thongtinService {
	public List<thongtin> getAll();
	public void save(thongtin thongtin);
	public thongtin findAllByEmail(String email);
}
