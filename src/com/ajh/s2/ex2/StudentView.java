package com.ajh.s2.ex2;

public class StudentView {

	// 메서드명이 viewAll
	// menu에서 1번 선택시 실행하는 메서드
	// 전체 학생 정보 출력

	public void viewAll(Student[] students) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");

		for (int k = 0; k < students.length; k++) {
			System.out.print(students[k].name + "\t");
			System.out.print(students[k].num + "\t");
			System.out.print(students[k].kor + "\t");
			System.out.print(students[k].eng + "\t");
			System.out.print(students[k].math + "\t");
			System.out.print(students[k].total + "\t");
			System.out.println(students[k].avg);
			System.out.println("=======================================================");
		}
	}

	public void viewOne(Student student) {

		// 메서드명 viewOne
		// menu에서 2번 선택시 실행하는 메서드
		// 학생 한명 정보 출력

		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		System.out.print(student.name + "\t");
		System.out.print(student.num + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.total + "\t");
		System.out.println(student.avg);
		System.out.println("=======================================================");
	}
}
