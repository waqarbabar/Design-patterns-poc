package com.design.patterns.creational.builder;

public class TestCoffeeBuilder {

	public static void main(String[] args) {
		Coffee coffee = new Coffee.CoffeeBuilder().setCost(500).setFlavor(Flavor.HAZELNUT).setSize(Size.LARGE)
				.setStrength(3).setType(Type.AFFOGATO).build();
		
		System.out.println(coffee);

	}

}
