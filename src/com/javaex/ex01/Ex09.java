package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//대입 현산자 (기호: =  / 같다의 기호 ==)
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-------");
		
		//산술 연산자
		int sum = a + b;
		System.out.println(sum);  // +
		
		System.out.println(a-b);  // +
		System.out.println(a-b);  // -
		System.out.println(a*b);  // 곱하기 (*)
		System.out.println(a/b);  // 나누기 (/) 7/2=(3)---1
		System.out.println(a%b);  // 나누기 7/2=3---(1)
		
		System.out.println(7/2); // 정수/정수 => 정수
		System.out.println(7.0/2); // 7.0/2 => 실수 (7.0/2.0 = 3.5)
		System.out.println(7.0/2.0); // 7.0/2.0 = 3.5
		
		System.out.println("-------");
		
		// 부호 연산자
		
		int var = -3;
		int pVar = -var;  // -(-3) = 3
		System.out.println(pVar);
		
		int mVar = +var;
		System.out.println(mVar);  // +(-3) = -3
		
		System.out.println("-------");
		
		// 증가, 감소 연산자 (증감연산자)
		System.out.println(a);  // 7
		System.out.println(++a);  // 7 --> 8 변수값 변경. 피연산자 값에 1을 증가 +1 (=8). 출력과 연산 동시
		System.out.println(a);  // 실제 메모리값 변경 
		
		System.out.println(b); // 2
		System.out.println(--b); // 1
		
		System.out.println("-------");
		
		System.out.println(a);  // 8
		System.out.println(a++);  // 8   출력 우선, +1 
		System.out.println(a);  // 9 
		
		System.out.println(b);  // 1
		System.out.println(b--);  // 1  출력 우선, -1
		System.out.println(b);  //0
		
		// 해야할 일을 나열. 가장 먼저 or 가장 나중에 할 지 결정
		
		System.out.println("-----------");
		
		int c = 5;
		System.out.println(c);
		System.out.println(++c * 2); // 12?  (+1, *2, 출력)
		System.out.println(c); //6
		
		int d = 5;
		System.out.println(d);
		System.out.println(d++ * 2); // 5? 출력 먼저니까  (엥 ㅅㅂ 10임 곱해서 그런가) // d(*2)->1순위, 출력->2순위, d(+1)->3순위
		System.out.println(d); // 6
	}

}
