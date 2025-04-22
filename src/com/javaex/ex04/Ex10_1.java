package com.javaex.ex04;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int no = sc.nextInt();
			
			if (no==0) {
				break;
			} //break때문에 else 생략 가능
			
			if (no%3==0) {
				System.out.println("3의 배수입니다. ");
			} else {
				System.out.println("3의 배수가 아닙니다. ");
			}
			
		}
		
		
		System.out.println("종료");
		
		sc.close();
		
	}

}
