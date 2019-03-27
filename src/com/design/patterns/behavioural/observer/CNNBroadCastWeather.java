package com.design.patterns.behavioural.observer;

public class CNNBroadCastWeather implements IObserver {
	
	private NASA nasa;

	@Override
	public void update() {
		System.out.println(nasa.getChangeInWeather() + " : CNN Broadcast Weather service");

	}

	public CNNBroadCastWeather(NASA nasa) {
		this.nasa = nasa;
	}

}
