package com.coders.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.coders.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account account) {
		
		System.out.println(getClass()+" :Doing my db work of adding account");
	}
	
	
	public void addDoWork() {
		
		System.out.println(getClass()+" :Doing work");
	}
	
}
