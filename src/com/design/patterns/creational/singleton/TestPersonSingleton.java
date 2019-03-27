package com.design.patterns.creational.singleton;

public class TestPersonSingleton {

	public static void main(String[] args) {
		Person person = Person.getInstance();
		person.setName("Waqar");
		System.out.println(person);
		System.out.println(Person.getInstance());
		System.out.println(Person.getInstance());
		person.setName("Babar");
		System.out.println(Person.getInstance());

	}

}
