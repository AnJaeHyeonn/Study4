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

		pv.view(ph.company, ph.brand, ph.color, ph.size, ph.price);

		System.out.println("Ex1 Finish");

	}

}
