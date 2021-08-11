package com.tcs.threads;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1 = new Worker();
		Thread t1= new Thread(worker1);
		t1.start();
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().toString() +i);
		}
	}

}
