package com.tcs.entity;

public class User {
	private String name;
	private long mobileNumber;
	private byte age;
	
	public void workout() {
		// TODO Auto-generated method stub
		System.out.println(name+"is working out.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name="+name+"]";
	}
}
