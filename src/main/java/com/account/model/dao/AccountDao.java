package com.account.model.dao;

import java.util.List;

import com.account.model.dto.User;

public interface AccountDao {
	
	public boolean registerUser(User userInfo,String to,String subject,String body);
	public User loginUser(String userName,String password);
	public boolean updateUser(User userInfo);
	public boolean removeUser(int id);
	public List<User> getAllUsers();
	
	public List<User> searchByName(String userName);
	public boolean changePassword(String email,String password,String newPassword);

}
