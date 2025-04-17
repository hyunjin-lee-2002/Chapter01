package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		double v01 = 5/4;   // 1.25
		System.out.println(v01);  // 5/4 (정수로만 연산 / double형이라 1.0으로 출력 / java는 정수형(연산)정수형은 정수형으로 계산)
		
		double v02 = (double)5/4;  // 1.25
		System.out.println(v02);   // 5.0/4.0 = 1.25 (실수정수라 연산불가. 하나로 통일)
		
		double v03 = 5/(double)4; // 1.25
		System.out.println(v03);  // 5.0/4.0 = 1.25
		
		double v04 = (double)5/(double)4; // 5.0/4.0 = 1.25
		System.out.println(v04);
		
		double v05 = (int)1.3 + (int)1.8; // 1+1=2
		System.out.println(v05);
		
		double v06 = (int)1.3 + 1.8;  // 1+1.8=> 1.0+1.8
		System.out.println(v06);	  //1.3+1.8 =3.1 ==> 3.0 (X)
	}

}
