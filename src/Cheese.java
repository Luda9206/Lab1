package bsu.rfe.java.group6.lab1.Ivleva.var1;

public class Cheese extends Food  {
	public Cheese() {
		super("Сыр");
	}
	
	public void consume() {
		System.out.println(this + " съеден");
	}

	public int calculateCalories() {
		int calories = 402;
		return calories;
	}
	
}
