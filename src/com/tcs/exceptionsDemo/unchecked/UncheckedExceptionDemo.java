package com.tcs.exceptionsDemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.work();
	}

}

class User{
	int age = 70;
	public void work() {
		if(age<=18) {
			throw new UndeAgeException("No child labor");
//			System.out.println("unreachable");
		}
		else if (age>60) {
			throw new OverAgeException("age should not be >60");
		}
	}
}
