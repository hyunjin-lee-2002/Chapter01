package com.javaex.practice;

public class Ex12 {
	
	public static void main(String[] args) {
//		다음 코드의 잘못된 부분을 찾아서 수정해 보세요.(코드를 작성해서 오류가 없도록 변경해 보세요.)
		
//		int x, y = 0;  //x와 y를 모두 0으로 초기화
//		char grade = "A"; //문자 A를 gade에 대입
//		int salary = 2,000,000; // salary에 2,000,000d을 대입
//		byte n = 1000; // n에 1000을 대입
		
		int x, y = 0;
		char grade = 'A';  // char은 '' 사용
		int salary = 2000000;  //, 제거
		int n = 1000;  // byte는 -128~127까지 표현 가능함. 1000은 표현 불가. int로 변경함.
		
	}

}
