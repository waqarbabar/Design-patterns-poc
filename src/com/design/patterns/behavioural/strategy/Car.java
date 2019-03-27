package com.design.patterns.behavioural.strategy;

public class Car {
	IDisplayBehaviour displayBehaviour;
	ITypeBehaviour typeBehaviour;
	IDriveBehaviour driveBehaviour;

	public Car(IDisplayBehaviour displayBehaviour, ITypeBehaviour typeBehaviour, IDriveBehaviour driveBehaviour) {
		this.displayBehaviour = displayBehaviour;
		this.typeBehaviour = typeBehaviour;
		this.driveBehaviour = driveBehaviour;
	}
	
	public void display() {
		this.displayBehaviour.Display();
	}

	public void type() {
		this.typeBehaviour.type();
	}
	
	public void drive() {
		this.driveBehaviour.drive();
	}
}
