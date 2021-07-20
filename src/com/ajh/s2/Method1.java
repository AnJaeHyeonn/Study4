package com.ajh.s2;

import java.util.Scanner;

public class Method1 {

	// 접근지정자 그외지정자 리턴타입 메서드명 (매개변수언언) {}

	// 접근지정자는 모르거나 확신이 안드면 public
	// 그외지정자는 모르거나 확신이 안드면 쓰지말기
	// 리턴타입은 모르거나 확신이 안드면 void
	// 매개변수는 모르거나 확신이 안드면 쓰지말기

	public void prn() {
		System.out.println("prn method 실행");
	}

	public void prn2() {

		System.out.println("횟수를 입력하세요.");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Hello World");
		}
	}

	public void prn3() {
		System.out.println("Hello World");
	}

	public void prn4(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Hello World");
		}
	}

}
