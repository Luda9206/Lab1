package bsu.rfe.java.group6.lab1.Ivleva.var1;

public class Chocolate extends Food {
	
	public Chocolate() {
		super("Шоколад");
	}

	@Override
	public void consume() {
		System.out.println(this + " съеден");
	}

	@Override
	public int calculateCalories() {
		return 1000;
	}

}
