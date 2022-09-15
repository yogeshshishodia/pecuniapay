package com.prodapt.payment.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer accountNo;
	private String ifscCode;
	private String bankName;
	private double balance;
	
	@OneToOne(cascade = {CascadeType.ALL})	
	private Wallet wallet;

	public BankAccount() {
		
	}

	public BankAccount(Integer id, Integer accountNo, String ifscCode, String bankName, double balance, Wallet wallet) {
		
		this.id = id;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.balance = balance;
		this.wallet = wallet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", bankName="
				+ bankName + ", balance=" + balance + ", wallet=" + wallet + "]";
	}
	
}

	