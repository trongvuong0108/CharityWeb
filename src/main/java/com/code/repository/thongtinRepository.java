package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.model.thongtin;

public interface thongtinRepository extends JpaRepository<thongtin, Integer>{
	public thongtin findByEmail(String email);
}
