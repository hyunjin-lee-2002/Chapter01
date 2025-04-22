package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("월을 입력하세요. ");
//		String code = sc.nextLine();
//		
		/*
//		switch(code) {
		
		case "1":  //31 
			System.out.println("31일 입니다. ");
			break; 
			
		case "2": 
			System.out.println("28일 입니다. ");
			break; 
			
		case "3": //31
			System.out.println("31일 입니다. ");
			break; 
			
		case "4": 
			System.out.println("30일 입니다. ");
			break; 
			
		case "5": //31
			System.out.println("31일 입니다. ");
			break; 
			
		case "6": 
			System.out.println("30일 입니다. ");
			break; 
			
		case "7": //31
			System.out.println("31일 입니다. ");
			break; 
			
		case "8": //31
			System.out.println("31일 입니다. ");
			break; 
			
		case "9": 
			System.out.println("30일 입니다. ");
			break; 
			
		case "10": //31
			System.out.println("31일 입니다. ");
			break; 
			
		case "11": 
			System.out.println("30일 입니다. ");
			break; 
			
		case "12": //31
			System.out.println("31일 입니다. ");
			break; 
			
		default:
			System.out.println("ERROR;");
			break;
		
		}
		
		
		sc.close();
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("월을 입력하세요. ");
		int month = sc.nextInt();
		
		switch(month) {
	
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break; 
			
		case 2:
			System.out.println("28일");
			break; 
	
		default: 
			System.out.println("31일");
			break; 
			
			
			
		}
		
		
	}

}
