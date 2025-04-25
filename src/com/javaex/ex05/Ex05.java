package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		/* 1)
		int[] intArr = new int[3]; 
		intArr [0] = 3;
		intArr [1] = 6;
		intArr [2] = 16;
		*/
		
		/* 1)
		int [] intArr = new int [] {3,6,35};     //숫자를 빼야함 {3 ,6, 35}
		*/
		
		/* 3) 
		int[] intArr = {3,6,35};
		*/  //메모리 방식은 셋 다 같음. 3번은 비추. 
		
		int[] intArr = {3, 6, 35};
		
		for(int i=0; i<intArr.length; i++ ) {
			System.out.println(intArr[i]);
		}
		
 	}

}
