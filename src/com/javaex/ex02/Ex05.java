package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
							//숫자를 받고 문자열을 받으려고 하면 오류 발생
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요. ");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		sc.nextLine(); //nextline 넣어서 수정
		
		System.out.println("이름을 입력하세요. ");
		System.out.print("이름: ");
		
		String name = sc.nextLine();
//		System.out.println("당신의 이름은 " + name + " 입니다.");
		
	
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
//		System.out.println("당신의 나이는 " + age + "살 입니다.");

		
		sc.close();      
		
	}
}
