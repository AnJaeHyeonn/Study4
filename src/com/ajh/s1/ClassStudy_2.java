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

		System.out.println("Study Finish");

	}

}
