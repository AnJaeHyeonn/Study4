package com.ajh.s2;

import java.util.Scanner;

public class MethMain1 {
	public static void main(String[] args) {

		System.out.println("Method1 Start");

		Method1 mth1 = new Method1();

		// 참조변수명.메서드명( );
		// 메서드 호출
		mth1.prn();
//		mth1.prn2();

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		mth1.prn4(count); // 인자값(파라미터)

		System.out.println("Method1 Finish");

	}

}
