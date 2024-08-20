package com.example.demo.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
 
@Repository
public class UserRepoImpl implements UserRepo {
 
	@Autowired
	EntityManager entityMan;
 
	@Override
	public User insertUser(User newUser) {
		entityMan.merge(newUser);
		return newUser;
	}
 
	@Override
	public User updateUser(User user) {
		entityMan.merge(user);
		return user;
	}
 
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		return entityMan.createQuery("from User").getResultList();
 
	}
 
	@Override
	public User userfind(int userId) {
		return entityMan.find(User.class, userId);
 
	}
 
	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getUserIdlist() {
		Query q = entityMan.createQuery("SELECT c.userId FROM User c");
		return q.getResultList();
 
	}
 
	@SuppressWarnings("unchecked")
	public List<User> searchUser(String userName) {
		Query qry2 = entityMan.createQuery("from User u where u.userName=?1");
		qry2.setParameter(1, userName);
		return qry2.getResultList();
	}
	public User userLogin(String userEmail, String userPassword) {
	    Query query = entityMan.createQuery("from User u where u.userEmail = :userEmail and u.userPassword = :userPassword");
	    query.setParameter("userEmail", userEmail);
	    query.setParameter("userPassword", userPassword);
	    List<User> results = query.getResultList();
	    if (results.isEmpty()) {
	        return null; // Or handle it in another appropriate way
	    }
	    return results.get(0); // Return the first result if available
	}
	
}