package bsu.rfe.java.group6.lab1.Ivleva.var1;

public class Apple extends Food {
	private String size;
	
	public Apple (String size) {
		super("Яблоко");
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Apple)) return false;
			return size.equals(((Apple)arg0).size);
		} 
		else
			return false;
	}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}

	public int calculateCalories() {
		int calories = 0;
		
		if (size.equals("Small")) {
			calories += 60;
		} else if (size.equals("Midi")) {
			calories += 90;
		} else if (size.equals("Big")) {
			calories += 120;
		}
		
		return calories;
	}
	
}
