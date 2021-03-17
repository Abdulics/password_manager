package com.dulTek.passManager.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dulTek.passManager.model.Password_management;

public interface PasswordsRepository extends JpaRepository<Password_management, String> {

}
