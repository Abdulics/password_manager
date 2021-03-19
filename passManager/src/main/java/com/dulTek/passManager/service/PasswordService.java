package com.dulTek.passManager.service;

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
     
    public Password_management get(String uname) {
        return repo.findById(uname).get();
    }
     
//    public void delete(long id) {
//        repo.deleteById(id);
//    }

}
