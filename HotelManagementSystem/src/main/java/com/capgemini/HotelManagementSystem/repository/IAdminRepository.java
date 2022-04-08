package com.capgemini.HotelManagementSystem.repository;

import com.capgemini.HotelManagementSystem.entity.Admin;

public interface IAdminRepository {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}
