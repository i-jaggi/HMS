package com.capgemini.HotelManagementSystem.repository;

import com.capgemini.HotelManagementSystem.entity.Transactions;

public interface ITransactionRepository {
	public Transactions addTransaction(Transactions transaction);
}
