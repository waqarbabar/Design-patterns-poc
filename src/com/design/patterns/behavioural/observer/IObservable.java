package com.design.patterns.behavioural.observer;

public interface IObservable {

	void add(IObserver observer);
	void remove(IObserver observer);
	void notifyTheChange();
}
