package bsu.rfe.java.group6.lab1.Ivleva.var1;

public class Tea extends Food {

	private String color;

	public Tea(String color) {
		super("Чай");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return super.toString() + " типа '" + color.toUpperCase() + "'";
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Tea)) return false;
			return color.equals(((Tea)arg0).color);
		} 
		else
			return false;
	}

	@Override
	public void consume() {
		System.out.println(this + " выпит");
	}

	public int calculateCalories() {
		int calories = 0;
		
		if (color.equals("Black")) {
			calories += 2;
		} else if (color.equals("Green")) {
			calories += 5;
		} 
		
		return calories;
	}
	
}
