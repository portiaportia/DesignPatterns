package csce247.decorator;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	
	public double getCost() {
		return beverage.getCost() + 0.1;
	}
}
