package com.bptn.course.day_07.CustomExceptionInsufficientFunds;

//InsufficientFundsException.java 
public class InsufficientFundsException extends Exception {

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
