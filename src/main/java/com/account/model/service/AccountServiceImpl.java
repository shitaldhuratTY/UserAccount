package com.account.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.account.model.dao.AccountDao;
import com.account.model.dto.User;


public class AccountServiceImpl implements AccountService {

	@Autowired
    private AccountDao dao;
	
	
	@Override
	public boolean registerUser(User userInfo, String to, String subject, String body) {
		return dao.registerUser(userInfo,to,subject,body);
	}

	@Override
	public User loginUser(String userName, String password) {
		return dao.loginUser(userName, password);
	}

	@Override
	public boolean updateUser(User userInfo) {
		return dao.updateUser(userInfo);
	}

	@Override
	public boolean removeUser(int id) {
		return dao.removeUser(id);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

}
