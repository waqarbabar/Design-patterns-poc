package com.design.patterns.creational.singleton;

public class Person {
	private String name;
	private static Person instance = null;

	private Person() {
	};

	public static Person getInstance() {
		if (null == instance) {
			synchronized (Person.class) {
				if(null == instance) {
					instance = new Person();
				}
			}
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setInstance(Person instance) {
		Person.instance = instance;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
