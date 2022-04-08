package com.capgemini.HotelManagementSystem.service;

import java.util.List;

import com.capgemini.HotelManagementSystem.entity.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public void removeUser(User user);
	public List<User> showAllUsers();
	public User showUser(User user);
}
