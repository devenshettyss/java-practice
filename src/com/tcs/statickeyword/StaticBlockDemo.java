package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age=10;
	int price=20;
	public StaticBlockDemo() {
		System.out.println("in constructor..");
	}
	static {
		final int localVariable=40;
		System.out.println("This is static block."+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void work() {
		int time=45;
	}

}
