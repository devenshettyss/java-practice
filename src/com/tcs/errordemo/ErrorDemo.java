package com.tcs.errordemo;

public class ErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ErrorDemo().infiniteMethod();
		
	}
	private void infiniteMethod() {
		try{
			infiniteMethod();
		}
	}

}
