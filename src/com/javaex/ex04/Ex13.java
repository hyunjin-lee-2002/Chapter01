package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner (System.in);
//		System.out.println("숫자를 입력하세요. ");
//		int sum = 0;
//		int num;
//		
//		do {
//			//숫자 입력
//			num = sc.nextInt();
//			//합계
//			sum = num + sum;
//			//합계 출력
//			System.out.println("합계: " + sum);
//			
//		}while(num != 0 );
//		
//		System.out.println("end");
//		sc.close();
		
		//////////////////////////////////////
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		System.out.println("숫자를 입력하세요. ");
		
		while(true) {  //0이면 끝
			int num = sc.nextInt();  // 숫자 입력
			sum = sum + num;
			System.out.println("합계: "+ sum);  // 출력
			
			if(num == 0) {
				break;
			}
			 
		}
		
		System.out.println("종료");
		
		sc.close();
		
	}

}
