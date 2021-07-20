package com.ajh.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");

		Phone ph = new Phone();
		PhoneView pv = new PhoneView();

		ph.company = "Sansung";
		ph.brand = "Galaxy S20";
		ph.color = "Gray";
		ph.size = 256;
		ph.price = 1000000;

		Phone ph2 = new Phone();

		ph2.company = "Apple";
		ph2.brand = "I-Phone 13";
		ph2.color = "Silver";
		ph2.size = 512;
		ph2.price = 1500000;

		pv.view(ph.company, ph.brand, ph.color, ph.size, ph.price);
//		pv.view1(ph);

		Phone[] phones = new Phone[2];
		phones[0] = ph;
		phones[1] = ph2;

		pv.makePrice(phones);

		System.out.println("Ex1 Finish");

	}

}
