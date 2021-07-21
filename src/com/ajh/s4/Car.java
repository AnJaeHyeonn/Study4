package com.ajh.s4;

public class Car {

	String company;
	String brand;
	String color;
	int price;
	int gitong;

	// 생성자
	public Car() {
		this("Black", 2000); // 자기 자신의 또다른 생성자 호출
	}

	// 생성자 오버로딩
	public Car(String color) {
		this(color, 8000000);
		System.out.println("성공");
	}

	public Car(String color, int price) {
		this.company = "Kia";
		this.brand = "K7";
		this.color = color;
		this.price = price;
		this.gitong = 8;
	}

	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand :" + this.brand);
		System.out.println("Color :" + this.color);
		System.out.println("Price : " + this.price);
		System.out.println("Gitong : " + this.gitong);
	}

}
