package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3]; 
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 7.6;
		doubleArr[2] = 4.1;
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("=======");
		
		char[] charArr = new char[3];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		
		for (int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		System.out.println("=======");
		
		String[] sArr = new String[3]; 
		
		sArr[0] = "집갈래";
		sArr[1] = "자고싶음";
		sArr[2] = "침대에 눕고싶음";
		
		for (int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		System.out.println("===");
		System.out.println(sArr[2]);
	}

}
