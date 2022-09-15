package com.prodapt.payment.Entity;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;



public class Customer {
	private String name;
	private Integer mobileNumber;
	private String email;
	private String password;
	
	@OneToOne(cascade = {CascadeType.ALL})	
	private Wallet wallet;
	
	public Customer() {
		
	}

	public Customer(String name, Integer mobileNumber, String email, String password, Wallet wallet) {
		
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.wallet = wallet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", password="
				+ password + ", wallet=" + wallet + "]";
	}
	
	





	
	
	

}
