package com.prodapt.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prodapt.payment.Entity.BankAccount;
import com.prodapt.payment.repository.AccountRepository;



@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepo;

	@Override
	public List<BankAccount> getAllAccount() {
		return (List<BankAccount>) accountRepo.findAll();
		
	}

	

	@Override
	public BankAccount updateAccount(BankAccount bankAccount) {
		if(accountRepo.existsById(bankAccount.getAccountNo())) {
			return accountRepo.save(bankAccount);
		}else {
			return null;
			
		}
		
	}



	@Override
	public BankAccount getAccountByAccountNo(Integer AccountNumber) {
		return accountRepo.findByaccountNo(AccountNumber);
		
	}


	@Override
	public BankAccount addAccount(BankAccount bankAccount) {
		return accountRepo.save(bankAccount);
	}


}

