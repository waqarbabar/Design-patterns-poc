package com.design.patterns.creational.factory;

public class TestCarFactory {
	public static void main(String[] args) {
	CarFactory factory = new CarFactory();
	
	Car car = factory.createCar("honda");
	car.move();
	car = factory.createCar("toyota");
	car.move();
	car = factory.createCar("suzuki");
	car.move();
	}
}
