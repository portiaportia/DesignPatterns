package csce247.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.description = "aroma fillecd dark roast";
	}
	
	public double getCost() {
		return super.getCost() + 0.99;
	}
}
