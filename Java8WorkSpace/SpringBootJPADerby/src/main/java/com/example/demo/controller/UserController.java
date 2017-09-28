package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRecord;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/users")
	public Iterable<UserRecord> getAllUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping("/users/{id}")
	public UserRecord getUser(@PathVariable String id){
		return userRepository.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody UserRecord user){
		userRepository.save(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public String updateUser(@RequestBody UserRecord user, @PathVariable String id){
		boolean flag = userRepository.exists(id);
		if(flag){
			UserRecord userTemp = userRepository.findOne(id);
			userTemp = user;
			userRepository.save(userTemp);
			return "User Updated Successfully";
		}else{
			return "User not Found";
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable String id){
		userRepository.delete(id);
	}

}
