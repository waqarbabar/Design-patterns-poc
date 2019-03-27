package com.design.patterns.behavioural.strategy;

public class OffRoadDrive implements IDriveBehaviour {

	@Override
	public void drive() {
		System.out.println("The drive of the car is Off-Road!");

	}

}
