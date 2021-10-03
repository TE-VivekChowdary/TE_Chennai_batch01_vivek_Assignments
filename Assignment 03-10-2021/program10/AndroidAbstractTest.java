package com.te.Assignment;

public class AndroidAbstractTest {
	
	public static void main(String[] args) {

		AndroidAbstract ref;
		ref = new Redmi();
		ref.calling();
		ref.messaging();
		ref.ui();


		ref = new Oppo();
		ref.calling();
		ref.messaging();
		ref.ui();
	}

}
