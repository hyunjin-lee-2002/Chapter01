package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		
		int a = 5; 
		int b = 3;
		
		System.out.println(a<b); // 5<3 --> false
		System.out.println(a>b); // 5>3 --> true
		
		System.out.println(a<=b); //5<=3 --> false
		System.out.println(a>=b); //5>=3 --> true
		
		System.out.println(a==b); // not same. false // 5를 3에 대입하라
		System.out.println(a!=b); // not same. true // ! means not
		
		boolean result = a==b;
		System.out.println(result); // a and b are not same. false
		
		boolean result1 = a!=b;
		System.out.println(result1); // a and b are not same. true (!= means NOT)
	}

}
