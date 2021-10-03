package com.te.Assignment;

public class Withdraw extends BankAccount {

	static void withDraw() {

		if (accBal > amt) {
			System.out.println("Withdrawa Success...");
		} else {
			System.out.println("Insufficient Balance...");
		}
	}

}
