package com.design.patterns.creational.builder;

public class Coffee {
	private int cost;
	private Flavor flavor;
	private Size size;
	private Type type;
	private int strength;

	public int getCost() {
		return cost;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public Size getSize() {
		return size;
	}

	public Type getType() {
		return type;
	}

	public int getStrength() {
		return strength;
	}

	private Coffee(CoffeeBuilder cb) {
		super();
		this.cost = cb.cost;
		this.flavor = cb.flavor;
		this.size = cb.size;
		this.type = cb.type;
		this.strength = cb.strength;
	}

	public static class CoffeeBuilder {
		private int cost;
		private Flavor flavor;
		private Size size;
		private Type type;
		private int strength;

		public int getCost() {
			return cost;
		}

		public CoffeeBuilder setCost(int cost) {
			this.cost = cost;
			return this;
		}

		public CoffeeBuilder setFlavor(Flavor flavor) {
			this.flavor = flavor;
			return this;
		}

		public CoffeeBuilder setSize(Size size) {
			this.size = size;
			return this;
		}

		public CoffeeBuilder setType(Type type) {
			this.type = type;
			return this;
		}

		public CoffeeBuilder setStrength(int strength) {
			this.strength = strength;
			return this;
		}

		public Coffee build() {
			return new Coffee(this);
		}

	}

	@Override
	public String toString() {
		return "Coffee [cost=" + cost + ", flavor=" + flavor + ", size=" + size + ", type=" + type + ", strength="
				+ strength + "]";
	}

}
