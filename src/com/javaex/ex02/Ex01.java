package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println("집갈래");
		System.out.println("집가고 싶어요");
		
		System.out.print("집");
		System.out.println("보내줘");
		
		System.out.println("----------");
		
		
		int i = 2345;
		double d = 3.14;
		char c = '집';
		
		String s = "집";
		String str = "가고싶다";
		String name = "이현진";
		
		System.out.println(s);
		System.out.println(str); //print랑 문법은 같음
//		System.out.println(5+3);
		System.out.println(name+s+str);
		
		System.out.println("집가서"+"자고싶다");
		System.out.println("집"+str);
		
		System.out.println(i+i); //정수 + 정수
		System.out.println(i+d); //정수 + 실수 --> 실수(자동형변환)+실수
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result = name + d;  //문자열 + 정수 ==> 문자열+살슈 ==> 문자열 (문자열이랑 더하면 다 문자열)
		System.out.println(result);
		
		
		//이현진"은"집가고싶다
		System.out.println(name+"은"+s+str);

		//이현진"은" 집가고싶다
		System.out.println(name+"은 "+s+str);
		
		// 이현진 집가고싶다
		System.out.println(name+ " "+ s + str);
		
		//내 이름은 이현진 입니다.
		System.out.println("내"+" 이름은 "+ name +" 입니다.");
		
		System.out.println("-----------------");  
		System.out.println(c);  //집
		System.out.println(c+c);  // 코드로 인식해서 숫자로 출력 / char형(코드값 숫자로 관리)은 + 숫자 더하기
		
		// 제 이름은 "이현진" 입니다.  //   \"  <-이게 한 세트 글자
		System.out.println("제 이름은 \"" + name + "\" 입니다.");
		
		
		// 제 이름은 '이현진' 입니다. / ' <-- 이거는 \이 표시 필요 X
		System.out.println("제 이름은 '" + name + "' 입니다.");
		
		// 제 이름은 \이현진\ 입니다.   /   \넣고 싶으면 \\ 두 개 쓰기
		System.out.println("제 이름은 \\" + name + "\\ 입니다.");
		
		// 탭은 앞줄부터 글자배열 맞춰줌 ( \t)
		System.out.println("제이름은\t" + name + " 입니다.");
		// 줄바꿈(엔터) 기호 (   \n)
		System.out.println("제 이름은\n" + name + " 입니다.");
		
		
		
		
	}
}
