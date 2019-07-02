package csce247.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		this.description = "Espresso";
	}
	
	public double getCost() {
		return 1.99;
	}
}
