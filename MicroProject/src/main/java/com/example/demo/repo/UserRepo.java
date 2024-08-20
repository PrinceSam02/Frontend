package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.User;

public interface UserRepo {
	public User insertUser(User newUser);
	 
	public User updateUser(User user);

	public List<User> getUsers();

	public User userfind(int userId);

	public List<Integer> getUserIdlist();

	public List<User> searchUser(String userEmail);
//	public User userLogin(String userName, String userPassword);
	public User userLogin(String userEmail, String userPassword);
}
