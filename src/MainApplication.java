package bsu.rfe.java.group6.lab1.Ivleva.var1;

import java.util.Arrays;

public class MainApplication {
	public static void main(String[] args) {

		Food[] breakfast = new Food[20];
		int i=0;
		for (String arg: args) {
			String[] parts = arg.split("/");

			if (parts[0].equals("Apple")) {
				breakfast[i] = new Apple(parts[1]);
			} 
			if (parts[0].equals("Cheese")) {
				breakfast[i] = new Cheese();
			} 
			if (parts[0].equals("Tea")) {
				breakfast[i] = new Tea(parts[1]);
			} 
			if (parts[0].equals("Chocolate")) {
				breakfast[i] = new Chocolate();
			} 
			i++;
		}

		Arrays.sort(breakfast, new FoodComparator());
		
		int calories = 0;
		for (Food item: breakfast)
			if (item!=null) {
				calories += item.calculateCalories();
				item.consume();
			}
			else break;
		System.out.println(calories + " калорий");
		System.out.println("Всего хорошего!");
	}

}

