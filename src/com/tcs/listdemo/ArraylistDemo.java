package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = createList();
		System.out.println(createList());
		numbers.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 -o1;
			}
			
			
		});
		System.out.println("After sorting "+numbers);
	}
	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		System.out.println(numbers.get(0));
		for(int count=0; count<20;count++) {
			numbers.add(count);
		}
		return numbers;
	}

}
