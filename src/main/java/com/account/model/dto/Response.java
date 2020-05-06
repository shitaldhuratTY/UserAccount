package com.account.model.dto;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Response {
	
	
	
	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", message=" + message + ", description=" + description
				+ ", user=" + user + "]";
	}
	private int statusCode;
	private String message;
	private String description;
	private List<User> user;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}

}
