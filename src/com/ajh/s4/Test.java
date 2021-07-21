package com.ajh.s4;

public class Test {

	int num;
	int num2 = 2;
	int num3;
	int num4;
	int num5;

	{
		// 초기화 블럭
		System.out.println("초기화 블럭");
		num4 = 4;
	}

	public Test() {
		System.out.println("생성자");
		num3 = 3;
		num2 = 22;
		num4 = 44;
	}
	
	public void setNum5() {
		num5 = 5;
	}

}
