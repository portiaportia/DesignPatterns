package csce247.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		this.description = "small but powerfull expresso";
	}
	
	public double getCost() {
		return 1.99;
	}
}
