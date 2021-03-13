package com.dulTek.passManager.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dulTek.passManager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
