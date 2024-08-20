package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	public User insertUser(User newUser);
	 
	public User updateUser(User user);
 
	public List<User> getUsers();
 
	public User userfind(int userId);
 
	public List<Integer> getUserIdlist();
 
	public List<User> searchUser(String userEmail);
	public User userLogin(String userEmail, String userPassword);
 
}
