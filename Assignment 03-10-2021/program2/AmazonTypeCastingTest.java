package com.te.Assignment;

public class AmazonTypeCastingTest {
	
	public static void main(String[] args) {

		// UpCasting : FlipKartPayment ---->FlipKartTypeCasting
		AmazonTypeCasting fp1 = new Payment();
		fp1.product();

		// DownCasting : FlipKartTypeCasting ----->AddToKart
		AddToKart fp2 = (AddToKart) fp1;
		fp2.product();
		fp2.store();

		// DownCasting : AddToKart ----->FlipKartPayment
		Payment fp3 = (Payment) fp2;
		fp3.product();
		fp3.store();
		fp3.payment();

		// DownCasting : FlipKartTypeCasting ---->FlipKartPayment
		Payment fp4 = (Payment) fp1;
		fp4.product();
		fp4.store();
		fp4.payment();

		// UpCasting : AddToKart ---->FlipKartTypeCasting
		AmazonTypeCasting fp5 = new AddToKart();
		fp5.product();

		// DownCasting : FlipKartTypeCasting ----->AddToKart
		AddToKart fp6 = (AddToKart) fp1;
		fp6.product();
		fp6.store();
	}

}
