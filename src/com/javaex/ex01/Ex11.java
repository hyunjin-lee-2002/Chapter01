package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {
		
		//논리 연산자
		
		int a = 5;
		int b = 7;
		System.out.println("&&연산자(엄격) and---------");
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		System.out.println("|| 연산자(널널) or --------");
		System.out.println(true||true); //t||t -> true
		System.out.println(true||false); //t||f -> true
		System.out.println(false||true); // f||t -> true
		System.out.println(false||false); //f||f -> false
		
		System.out.println("! 연산자(반대)------");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("응용 ----------");
		boolean result = (a<b) && (a>b); // 5<7 && 5>7 -> t && f --> true
		System.out.println(result);
		
		System.out.println(true && false || true); //t&&f||t -> t&&f (1st), f||t (2nd)  --->1st = false, 2nd = true -> f||t==> true
		System.out.println(true||false||true); // t||f -> t   t||t -> t => t||t ==> true  / || true 연산자가 마지막에 오면 계산할 필요 없이 true
		
		System.out.println( !(a>b) );  //5>7 -> f  /  !f-->t 
		
		
	}

}
