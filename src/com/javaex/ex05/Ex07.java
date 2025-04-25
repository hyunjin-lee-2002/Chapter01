package com.javaex.ex05;

public class Ex07 {
	
	public static void main (String[] args) {
		
		int[] intArry;
		
		intArry = new int[5];
		
		intArry[0] = 3;
		intArry[1] = 6;
		intArry[2] = 9;
		intArry[3] = 12;
		intArry[4] = 15;
		
		int result = 0;
		
		//intArry.length = 5
		
		for (int i=0; i<intArry.length; i++) {
			result = result + intArry[i];
		}
		
		System.out.println("intArry의 4번째 값: " + intArry[3]);
		
		
		
	}

}
