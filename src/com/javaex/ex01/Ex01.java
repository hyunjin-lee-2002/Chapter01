package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] ages) {
		
		int myAge; /*선언*/
		myAge = 25; /*초기화 (처음 값을 넣는 것)*/
		
		System.out.println(myAge);  /*화면 출력*/
		
		
		myAge = 26;
		
		System.out.println(myAge);
		
		/*****************************/
		byte no;
		no=127;  /*byte는 -128 ~ 127까지 가능*/
		System.out.println(no);
		/*****************************/
		long no2;
		/* no2 = 2147483648;
		 * --> long형: int 범위까지는 L을 붙이지 않아도 됨. int 법위를 벗어나는 경우 L을 붙임. 걍 L 붙이자*/ 
		no2 = 2147483648L;
		System.out.println(no2);
		/*****************************/
		
		
	}

}
