package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main (String[] args) {
		
		
//		방법 1
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("단을 입력하세요.");
//		System.out.print("단: ");
//		
//		int dan = sc.nextInt();
//		
//		int i = 0;
//		int index = 1;
//		
//		while (i<9) {
//			System.out.println( dan + "*" + index + "=" + dan * index );
//			i ++; /* 증감식은 while 안에 써야 무한루프 안걸림 ㅅㅂ*/
//			index ++; /* 증감식은 while 안에 써야 무한루프 안걸림 ㅅㅂ*/
//		} 
//		
//		
//		sc.close();
		
		
//		 방법 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		int i = 1;
		
		while (i<=9) {
			System.out.println( dan + "*" + i + "=" + dan * i );
			i ++; /* 증감식은 while 안에 써야 무한루프 안걸림 ㅅㅂ*/
//			index ++; /* 증감식은 while 안에 써야 무한루프 안걸림 ㅅㅂ*/
		} 
		
		sc.close(); 
		
		
		
	}

}
