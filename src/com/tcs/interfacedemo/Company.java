package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStaff staff = new HR();
		staff.work();
		IStaff staff1 = new Guard();
		List<IStaff> allStaff = new ArrayList<IStaff>();
		allStaff.add(staff);
		allStaff.add(staff1);
		allStaff.add(staff1);
		System.out.println(allStaff.size());
		
//		Staff s1 = new Staff();
	}

}
