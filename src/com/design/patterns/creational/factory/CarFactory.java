package com.design.patterns.creational.factory;

public class CarFactory {
	public Car createCar(String car) {
		Car carObj = null;
		if (car.equalsIgnoreCase("Honda")) {
			carObj = new Honda();
		} else if (car.equalsIgnoreCase("Toyota")) {
			carObj = new Toyota();
		} else if (car.equalsIgnoreCase("Suzuki")) {
			carObj = new Suzuki();
		}
		return carObj;
	}
}
