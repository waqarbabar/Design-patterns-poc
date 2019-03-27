package com.design.patterns.behavioural.observer;

public class TestWeatherObserver {
	
	public static void main(String[] args) {
		NASA nasa = new NASA();
	
	BBCBroadCastWeather bbc = new BBCBroadCastWeather(nasa);
	CNNBroadCastWeather cnn = new CNNBroadCastWeather(nasa);
	
	nasa.add(bbc);
	nasa.add(cnn);
	
	
	//test the code
	nasa.setChangeInWeather("weather is cloudy");
	nasa.setChangeInWeather("it's snowy outside");
	nasa.setChangeInWeather("Sunny day");
	}

}
