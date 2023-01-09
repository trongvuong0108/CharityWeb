package com.code.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.Entity.thongtin;

public interface thongtinRepository extends JpaRepository<thongtin, Integer>{
	public thongtin findByEmail(String email);
}
