package com.capgemini.HotelManagementSystem.service;

import com.capgemini.HotelManagementSystem.entity.Admin;

public interface IAdminService {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}
