package com.prodapt.payment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.payment.Entity.BankAccount;

@Repository
public interface AccountRepository extends CrudRepository<BankAccount, Integer> {
	public BankAccount findByaccountNo(Integer accountNo);

}
