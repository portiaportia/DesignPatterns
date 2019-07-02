package csce247.decorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double getCost() {
		return beverage.getCost() + 0.1;
	}
}
