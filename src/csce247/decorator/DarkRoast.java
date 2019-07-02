package csce247.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.description = "Dark Roast";
	}
	
	public double getCost() {
		return 0.99;
	}
}
