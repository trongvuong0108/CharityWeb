package com.code.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.code.Entity.role;

public interface roleRepository extends JpaRepository<role, Integer>{
	role findByName(String s);
}
