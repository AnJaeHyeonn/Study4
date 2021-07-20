package com.ajh.s2.ex2;

import java.util.Scanner;

public class StudentView {

	// 메서드명이 viewAll
	// StudentMenu 1번 눌렀을 때, 전체 학생 정보 출력

	public void viewAll(Student[] st) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");

		for (int k = 0; k < st.length; k++) {
			System.out.print(st[k].name + "\t");
			System.out.print(st[k].num + "\t");
			System.out.print(st[k].kor + "\t");
			System.out.print(st[k].eng + "\t");
			System.out.print(st[k].math + "\t");
			System.out.print(st[k].total + "\t");
			System.out.println(st[k].avg);
			System.out.println("=======================================================");
		}
	}

	public void viewOne(Student st) {

		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		System.out.print(st.name + "\t");
		System.out.print(st.num + "\t");
		System.out.print(st.kor + "\t");
		System.out.print(st.eng + "\t");
		System.out.print(st.math + "\t");
		System.out.print(st.total + "\t");
		System.out.println(st.avg);
		System.out.println("=======================================================");
	}
}
