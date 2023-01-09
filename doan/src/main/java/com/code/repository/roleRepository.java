package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.code.model.role;

public interface roleRepository extends JpaRepository<role, Integer>{
	role findByName(String s);
}
