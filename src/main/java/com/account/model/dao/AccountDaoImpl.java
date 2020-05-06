package com.account.model.dao;

import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.account.model.dto.User;

public class AccountDaoImpl implements AccountDao{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Autowired
	private JavaMailSender sender;

	@Override
	public boolean registerUser(User userInfo, String to, String subject, String body) {
		
		MimeMessage message=sender.createMimeMessage();
	
		EntityManager em = factory.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body, true);
			sender.send(message);
			et.begin();
			em.persist(userInfo);
			et.commit();
			
			return true;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User userInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changePassword(String email, String password, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
