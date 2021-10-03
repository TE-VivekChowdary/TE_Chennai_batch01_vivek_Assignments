package com.te.Assignment;

abstract class DriverOracle implements DriverInterface {
	
	

		@Override
		public void connect() {
			System.out.println("Connect to Oracle Db");
		}

}
