package com.ajh.s2.ex1;

public class PhoneView {

	public void view(String company, String brand, String color, int size, int price) {

		System.out.println("제조사 : " + company);
		System.out.println("브랜드 : " + brand);
		System.out.println("색 : " + color);
		System.out.println("크기 : " + size);
		System.out.println("가격 : " + price);
	}

//	public void view1(Phone phone) {
//
//		Phone ph = new Phone();
//
//		System.out.println("제조사 : " + phone.company);
//		System.out.println("브랜드 : " + phone.brand);
//		System.out.println("색 : " + phone.color);
//		System.out.println("크기 : " + phone.size);
//		System.out.println("가격 : " + phone.price);
//	}

	// 핸드폰 여러 대의 가격 합계 / 매개변수는 하나만 선언
	public void makePrice(Phone[] phones) {

		int sum = 0;
		for (int i = 0; i < phones.length; i++) {
			sum = sum + phones[i].price;
		}
		System.out.println("최종 가격 : "+sum);

	}

}
