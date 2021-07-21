package com.ajh.s2.ex2;

import java.util.Scanner;

public class StudentController {

	public void start() {

		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균 계산
		// 모든 학생의 정보 출력

		Scanner sc = new Scanner(System.in);

		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		StudentSort ss = new StudentSort();

		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt(); // 학생 수 입력
		Student[] students = new Student[count]; // 입력 한 학생 수 크기의 배열 선언

		for (int i = 0; i < students.length; i++) {
//			Student student = si.makeStudent();
//			students[i] = student;
			students[i] = si.makeStudent();
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

				students = si.addArray(students);
				students[students.length - 1] = si.makeStudent();
				break;

			case 4:
				System.out.println("성적 순으로 정보를 출력합니다.");
				Student[] sort = ss.sortByAvg(students);
				sv.viewAll(sort);
				break;

			default:
				flag = !flag;
			}
		}

	}

}
