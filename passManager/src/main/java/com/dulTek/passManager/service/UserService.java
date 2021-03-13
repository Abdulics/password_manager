package com.dulTek.passManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dulTek.passManager.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private static UserRepository repo;	

//	public static String signup(User user) {
//		repo.save(user);
//		return user.getUsername();
//	}
	public void save(User user) {
		//System.out.println("Inside service class: "+ user.toString());
		System.out.println("In service First name is: " + user.getFirstName());
        //repo.save(new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getUsername(), user.getPassword()));
		repo.save(user);
    }
     
    public User get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
