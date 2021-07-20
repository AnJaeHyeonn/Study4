package com.ajh.s2.ex2;

import java.util.Scanner;

public class StudentMenu {

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균 계산

		// 모든 학생의 정보 출력
		int count = sc.nextInt();

		Student[] students = new Student[count];
		StudentView sv = new StudentView();

		for (int i = 0; i < students.length; i++) {

			Student student = new Student();
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
			students[i] = student;
		}

		boolean flag = true;

		while (flag) {
			System.out.println("1.전체 정보 출력\t2.학생 번호 검색\t3.학생 정보 추가\t4.성적 순 출력\t5.종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				sv.viewAll(students);
				break;

			case 2:
				System.out.println("검색 할 번호를 입력하세요.");
				int num = sc.nextInt();

				Student student = null;
				for (int i = 0; i < students.length; i++) {
					if (students[i].num == num) {
						student = students[i];
						break;
					}

				}

				if (student != null) {
					sv.viewOne(student);
				} else {
					System.out.println("해당 번호의 학생이 없습니다.");
					break;
				}
				break;

			case 3:
				System.out.println("학생 정보를 추가합니다.");
				break;

			case 4:
				System.out.println("성적 순으로 정보를 출력합니다.");
				break;

			default:
				flag = !flag;
			}
		}

	}

}
