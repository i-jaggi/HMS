package com.capgemini.HotelManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.HotelManagementSystem.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
//	public User addUser(User user);
//	public User updateUser(User user);
//	public User removeUser(User user);
//	public List<User> showAllUsers();
//	public User showUser(User user);
}