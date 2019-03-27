package com.design.patterns.behavioural.observer;

public class BBCBroadCastWeather implements IObserver {
	
	private NASA nasa;

	@Override
	public void update() {
		System.out.println(nasa.getChangeInWeather() + " : BBC Broadcast Weather Service");

	}

	public BBCBroadCastWeather(NASA nasa) {
		this.nasa = nasa;
	}

}