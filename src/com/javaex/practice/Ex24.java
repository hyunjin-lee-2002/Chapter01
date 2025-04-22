package com.javaex.practice;

public class Ex24 {
	
	//﻿다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다. 
	//결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
	
	public static void main (String[] args) {
		
//		double f=80.0;
//		System.out.println( 5/9 * (f-32.0));
		
// 0으로 나온 이유: 5와 9는 int 정수형 나눗셈이라 오류가 남. f 80.0에 맞춘 실수형으로 바꿔 5.0과 9.0으로 바꿔줌.
		
		double f = 80.0;
		double c = 5.0/9.0 * (f-32);
		System.out.println("섭씨 온도는 " + c );
		
	}

}
