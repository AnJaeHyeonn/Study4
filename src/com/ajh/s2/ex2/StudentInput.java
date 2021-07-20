package com.ajh.s2.ex2;

import java.util.Scanner;

public class StudentInput {

	public Student makeStudent() {
		// 매서드명 makeStudent
		// 학생 한명 생성
		// 이름, 번호, 국어, 영어, 수학 입력받고
		// 총점, 평균

		Student student = new Student();

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		student.name = sc.next();
		System.out.println("번호 입력");
		student.num = sc.nextInt();
		System.out.println("국어 입력");
		student.kor = sc.nextInt();
		System.out.println("영어 입력");
		student.eng = sc.nextInt();
		System.out.println("수학 입력");
		student.math = sc.nextInt();
		student.total = student.kor + student.eng + student.math;
		student.avg = student.total / 3.0;

		return student;

	}

	public Student[] addArray(Student[] students) {

		// 1. 새로운 배열 생성, 기존 배열보다 1칸 크게
		// 2. 복사

		Student[] st1 = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			st1[i] = students[i];
		}

		return st1;

	}
}
