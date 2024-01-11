package com.firstproject.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.app.modules.User;
import com.firstproject.app.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepository;
	
	//Get All Users
	public List<User> getuser(){
		return userRepository.findAll();
	}	
	
	//Get User By Id
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}	
	
	//Delete User
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	//Update User
	public void save(User user) {
		userRepository.save(user);
	}



}
