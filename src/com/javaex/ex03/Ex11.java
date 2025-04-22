package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요. ");
		System.out.println("과목: ");
		String code = sc.nextLine();  // 글자는 큰 따옴표("text") 붙이기
		
		switch(code) {//A, B, C, D, etc ...
			case "A": //code == "A"   
				System.out.println("R101호");
				break;
				
			case "B": // code == "B"
				System.out.println("R202호");
				break;
				
			case "C": // code == "C"
				System.out.println("R303호");
				break;
				
			case "D": // code == "D"
				System.out.println("404호");
				break;
				
			default: //나머지
				System.out.println("상담원 연결");
		}
		
		sc.close(); 

	}

}
