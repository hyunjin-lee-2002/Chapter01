package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {

		//lotto number
		
		int[] lotto = new int[6];
		
		/* 일정한 규칙이므로 for 사요항 수 있음. / 입력은 아닌 경우 많음
		lotto[0] = (int)(Math.random()*45)+1;
		lotto[1] = (int)(Math.random()*45)+1;
		lotto[2] = (int)(Math.random()*45)+1;
		lotto[3] = (int)(Math.random()*45)+1;
		lotto[4] = (int)(Math.random()*45)+1;
		lotto[5] = (int)(Math.random()*45)+1;
		*/
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		}
		
//		System.out.println(lotto[0]);  //3
//		System.out.println(lotto[1]);  //6
//		System.out.println(lotto[2]);  //9
//		System.out.println(lotto[3]);  //22
//		System.out.println(lotto[4]);  //34
//		System.out.println(lotto[5]);  //45
		
//		System.out.println("=============");
		
		for (int i = 0; i<6; i++) {
			System.out.print(lotto[i]+ "\t");
		}

		
	}

}
