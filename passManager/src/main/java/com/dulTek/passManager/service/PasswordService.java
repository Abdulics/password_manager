package com.dulTek.passManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dulTek.passManager.model.Password_management;
import com.dulTek.passManager.model.User;

@Service
public class PasswordService {
	@Autowired
	private PasswordsRepository repo;
	
	public void save(Password_management m) {
		repo.save(m);
    }
     
    public List<Password_management> getPasswords(String uname) {
        return repo.findAllByUsername(uname);
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
