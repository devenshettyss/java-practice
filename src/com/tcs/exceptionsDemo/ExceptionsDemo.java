package com.tcs.exceptionsDemo;

public class ExceptionsDemo {
	public static void main(String[] args) {
		demo2();
		//demo1();
	}
	private static void demo2() throws MyCheckedException {
		throw new MyCheckedException();
	}

	private static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			System.out.println("division by zero is not possible.");
		}
	}
}
