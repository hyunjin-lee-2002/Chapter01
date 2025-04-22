package com.javaex.practice;

public class Ex25 {
	//﻿아래의 출력결과를 예상하여 작성하세요. 
	public static void main(String [] args) {
		
		int a = 13;
		
		System.out.println( (a>13) && (a>=13) );  //f
		System.out.println( (a>13) || (a>=13) );  //t
		System.out.println( (a/3 == 4) && (a%3 == 2) );  //f
		System.out.println( (a/3 == 4) || (a%3 == 2) );  //f
		System.out.println( (a/3 == 4) && (a%3 == 2) || (a/3 == 4) );  //t
		
	}

}
