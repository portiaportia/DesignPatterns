package csce247.decorator;

public class Decaf extends Beverage{

	public Decaf() {
		this.description = "Decaf Coffees";
	}
	
	public double getCost() {
		return 1.05;
	}
}
