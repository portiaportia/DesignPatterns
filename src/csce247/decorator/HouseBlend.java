package csce247.decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		this.description = "simple house blend";
	}
	
	public double getCost() {
		return super.getCost() + 0.89;
	}
}
