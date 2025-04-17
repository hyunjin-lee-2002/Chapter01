package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//normal way
		double pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01); 
		
		//available change pi
		pi = 3.141512;
		double result02= pi*5*5;
		System.out.println(result02);
		
		//상수로 정의하는 방식
		final double PI=3.14;  /*상수로 정의할 때는 보통 대문자로 표기*/
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
//		(상수 final 써놨기에 수정 불가. 상수값 변경 시도 시 에러 발생)
//		PI=3.1415926; (PI는 상수. 선언 변경 시 에러 발생)
//		double result04 = PI*5*5;
//		System.out.println(result04); 
		
		
//		final double pi = 3.14;
//		
//		double result01 = pi*5*5;
//		System.out.println(result01); 
//		
//		pi = 3.141512;
//		double result02= pi*5*5;
//		System.out.println(result02);
		
		
	}

}
