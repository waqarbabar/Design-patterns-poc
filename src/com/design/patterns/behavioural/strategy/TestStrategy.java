package com.design.patterns.behavioural.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Car car = new  Car(new MultiColourDisplay(), new Sedan(), new CruiseDrive());
		car.display();
		car.drive();
		car.type();

	}

}
