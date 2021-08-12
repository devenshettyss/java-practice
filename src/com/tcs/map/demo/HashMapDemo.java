package com.tcs.map.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createHashMap();

	}

	private static void treeMap() {
		// TODO Auto-generated method stub
		Map<Integer, Float> mathScores = new TreeMap<Integer, Float>();
		for(int i =0 ; i<20;i++) {
			mathScores.put(i, new Float(100 * Math.random()));
		}
		System.out.println(mathScores);
	}
	
	private static void createHashMap() {
		// TODO Auto-generated method stub
		Map<String, Float> mathScores = new HashMap<String, Float>();
		for(int i =0 ; i<20;i++) {
			mathScores.put("student"+i, new Float(100 * Math.random()));
		}
		
		boolean exists = mathScores.containsKey("student1");
		System.out.println(exists);
		mathScores.put("student1", 34F);
		mathScores.remove("student1");
		System.out.println(mathScores);
	}

}
