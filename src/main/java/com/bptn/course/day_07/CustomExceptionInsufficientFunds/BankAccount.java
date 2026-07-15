package com.bptn.course.day_07.CustomExceptionInsufficientFunds;

//BankAccount.java
public class BankAccount {

	private double balance;
	private String accountNumber;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		balance -= amount;
		System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
	}

}
