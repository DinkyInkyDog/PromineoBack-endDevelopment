package com.LaurenAndrews;

public class stringChallenge {

	public static void main(String[] args) {
		double amount = 29.999;
		String statement = String.format("The balance in your account is: $%.2f ", amount);
		System.out.println(statement);
	}

}
