package com.code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.code.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);
	List<User> findAllByStatus(boolean status);
}
