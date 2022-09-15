package com.prodapt.payment.service;

import java.util.List;

import com.prodapt.payment.Entity.BankAccount;



public interface AccountService {
	
		public List<BankAccount> getAllAccount();
		//Create
		
		public BankAccount addAccount(BankAccount bankAccount);
		
		//Update
		public BankAccount updateAccount(BankAccount bankAccount);
		
	
		
		

		public BankAccount getAccountByAccountNo(Integer AccountNumber);

}
