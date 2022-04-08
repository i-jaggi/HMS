package com.capgemini.HotelManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelManagementSystem.entity.User;
import com.capgemini.HotelManagementSystem.exception.ResourceNotFoundException;
import com.capgemini.HotelManagementSystem.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public User updateUser(User user) {
		User updateUser = showUser(user);
		updateUser = userRepository.save(updateUser);
		return updateUser;
	}

	@Override
	public User showUser(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getUser_id());
		if (optionalUser.isEmpty())
			throw new ResourceNotFoundException("User Not found with id : " + user.getUser_id());
		User user1 = optionalUser.get();
		return user1;
	}

	@Override
	public void removeUser(User user) {
		User user1=showUser(user);
		if(user1==null) {
			throw new ResourceNotFoundException("User Not found with id : " + user.getUser_id());
		}
		userRepository.delete(user1);
	}

	@Override
	public List<User> showAllUsers() {
		List<User> allUsers = userRepository.findAll();
		return allUsers;
	}

}
