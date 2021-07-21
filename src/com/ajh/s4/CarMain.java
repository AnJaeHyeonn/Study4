package com.ajh.s4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		Car car2 = new Car("White");
		Car car3 = new Car("Pink",300);

		car.info();
		car2.info();
		car3.info();
	}

}
