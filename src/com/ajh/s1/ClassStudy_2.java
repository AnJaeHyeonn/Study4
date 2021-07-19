package com.ajh.s1;

import java.util.Scanner;

public class ClassStudy_2 {
	public static void main(String[] args) {
		System.out.println("Study2 Start");

		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		// 학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		// 총점, 평균 계산

		// 모든 학생의 정보 출력
		int count = sc.nextInt();

		Student[] st = new Student[count];

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			System.out.println(i + 1 + "번째 학생의 이름을 입력하세요.");
			st[i].name = sc.next();
			System.out.println(st[i].name + " 학생의 번호를 입력하세요.");
			st[i].num = sc.nextInt();
			System.out.println(st[i].name + " 학생의 국어 점수를 입력하세요.");
			st[i].kor = sc.nextInt();
			System.out.println(st[i].name + " 학생의 영어 점수를 입력하세요.");
			st[i].eng = sc.nextInt();
			System.out.println(st[i].name + " 학생의 수학 점수를 입력하세요.");
			st[i].math = sc.nextInt();

			st[i].total = st[i].kor + st[i].eng + st[i].math;
			st[i].avg = st[i].total / 3.0;

//			Student student = new Student();
//			System.out.println("이름을 입력하세요");
//			student.name = sc.next();
//			System.out.println("번호 입력");
//			student.num = sc.nextInt();
//			System.out.println("국어 입력");
//			student.kor = sc.nextInt();
//			System.out.println("영어 입력");
//			student.eng = sc.nextInt();
//			System.out.println("수학 입력");
//			student.math = sc.nextInt();
//			student.total = student.kor + student.eng + student.math;
//			student.avg = student.total / 3.0;
//			st[i]=student;
		}

		// 1. 전체 정보 출력
		// 2. 학생 번호 검색 (없으면 없다. 있으면 그 학생 정보 출력)
		// 3. 학생 정보 추가 - 학생 1명

		boolean check = true;

		while (check) {
			System.out.println("1.전체 정보 출력\t2.학생 번호 검색\t3.학생 정보 추가\t4.성적 순 출력\t5.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
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
				break;

			case 2:

				boolean flag = false;
				int him = 0;

				System.out.println("검색 할 번호를 입력하세요.");
				int num2 = sc.nextInt();

				for (int i = 0; i < st.length; i++) {
					if (num2 == st[i].num) {
						him = i;
						flag = true;

					}
				}
				if (flag == true) {

					System.out.println("=======================================================");
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
					System.out.print(st[him].name + "\t");
					System.out.print(st[him].num + "\t");
					System.out.print(st[him].kor + "\t");
					System.out.print(st[him].eng + "\t");
					System.out.print(st[him].math + "\t");
					System.out.print(st[him].total + "\t");
					System.out.println(st[him].avg);
					System.out.println("=======================================================");
					break;

				} else if (flag == false) {
					System.out.println("해당 번호의 학생이 없습니다.");
					break;
				}
			case 3:
				// 학생정보추가
				Student[] st1 = new Student[count + 1];
				for (int i = 0; i < st1.length; i++) {
					st1[i] = new Student();
				}
				for (int i = 0; i < st.length; i++) {
					st1[i] = st[i];
				}
				System.out.println("새로운 학생의 이름을 입력하세요.");
				st1[st.length].name = sc.next();
				System.out.println(st1[st.length].name + "학생의 번호를 입력하세요.");
				st1[st.length].num = sc.nextInt();
				System.out.println(st1[st.length].name + "학생의 국어 점수를 입력하세요.");
				st1[st.length].kor = sc.nextInt();
				System.out.println(st1[st.length].name + "학생의 영어 점수를 입력하세요.");
				st1[st.length].eng = sc.nextInt();
				System.out.println(st1[st.length].name + "학생의 수학 점수를 입력하세요.");
				st1[st.length].math = sc.nextInt();

				st1[st.length].total = st1[st.length].kor + st1[st.length].eng + st1[st.length].math;
				st1[st.length].avg = st1[st.length].total / 3.0;

				st = st1;

				break;

			case 4:
				for (int i = 0; i < st.length - 1; i++) {
					for (int j = 0; j < st.length; j++) {
						if (st[i].avg < st[j].avg) {

						}
					}
				}
			case 5:
				check = !check;

			}

		}

		System.out.println("Study Finish");

	}

}