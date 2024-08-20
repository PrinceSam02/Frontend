package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
 
	@Autowired
	UserRepo userdao;
 
	public User insertUser(User newUser) {
		return userdao.insertUser(newUser);
 
	}
 
	public User updateUser(User user) {
		return userdao.updateUser(user);
	}
 
	@Override
	public List<User> getUsers() {
		return userdao.getUsers();
	}
 
	@Override
	public User userfind(int userId) {
		return userdao.userfind(userId);
	}
 
	@Override
	public List<Integer> getUserIdlist() {
		return userdao.getUserIdlist();
	}
 
	public List<User> searchUser(String userEmail) {
		return userdao.searchUser(userEmail);
	}
 
	public User userLogin(String userEmail, String userPassword) {
		return userdao.userLogin(userEmail, userPassword);
	}
	
}