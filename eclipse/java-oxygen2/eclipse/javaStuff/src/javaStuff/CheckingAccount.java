package javaStuff;

import java.util.*;

public class CheckingAccount {
	
	private double balance;
	private int number;
	
	public CheckingAccount(int number) {
		this.number=number;
	}
	
	//deposit money
	public void deposit(double amount) {
		balance+=amount;
	}
	
	//withdraw money
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			double needs=amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	//get balance left
	public double getBalance() {
		return balance;
	}
	
	//get Number of Card
	public int getNumber() {
		return number;
	}

}
