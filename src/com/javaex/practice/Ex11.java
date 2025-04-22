package com.javaex.practice;

public class Ex11 {
	
	public static void main (String[] args) {
//		﻿ 아래의 코드에서 오류가 발생하는 부분을 예상하고 수정하세요
//		int iVar = 10;
//		long lvar = 1000000000000L;
//		char cVar = 'ab';
//		double dVar = 10;
//		float fVar = 12.4;
//		String str = 'ab';
		
		// char에는 한 단어만 올 수 있는데 ab 두 단어가 들어갔기에 오류가 남
		//float 타입은 f를 붙여줘야함.
		// String에는 큰따옴표(" ")만 사용 가능
		// 수정 답안
		
		int iVar = 10;
		long lvar = 1000000000000L;
		char cVar = 'a';
		double dVar = 10;
		float fVar = 12.4f;
		String str = "ab";
		
	}

}
