package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {

		
//		for( int=i=0 ; i<10 ; i++ ) {
//			System.out.println("1부터 10까지 정수의 합은" +  +"입니다." );
//		} 앞의 합 + 10
		int sum = 0;
		
		for( int i=1 ; i<=100 ; i++ ) {
			sum = sum+i;
		}
		
		System.out.println("1부터 100까지 정수의 합은 " + sum + "입니다.");
		
	}

}
