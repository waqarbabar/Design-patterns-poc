package com.design.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NASA implements IObservable{
	
	private List<IObserver> list = new ArrayList<>();
	private String changeInWeather;
	
	@Override
	public void add(IObserver observer) {
		list.add(observer);
		
	}

	@Override
	public void remove(IObserver observer) {
		list.remove(observer);
		
	}

	@Override
	public void notifyTheChange() {
		for(IObserver observer : list) {
			observer.update();
		}
		
	}

	public String getChangeInWeather() {
		return changeInWeather;
	}

	public void setChangeInWeather(String changeInWeather) {
		this.changeInWeather = changeInWeather;
		notifyTheChange();
	}
	

}
