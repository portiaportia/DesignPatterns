package csce247.decorator;

public abstract class Beverage {
	private static final double MILK_COST = 0.1;
	private static final double MOCHA_COST = 0.2;
	private static final double SOY_COST = 0.15;
	private static final double WHIP_COST = 0.10;
	
	private static final String MILK_DESC = "milk";
	private static final String MOCHA_DESC = "mocha";
	private static final String SOY_DESC = "soy";
	private static final String WHIP_DESC = "whip";
	
	protected String description;
	private boolean milk = false;
	private boolean soy = false;
	private boolean mocha = false;
	private boolean whip = false;
	
	public String getDescription() {
		if(hasMilk()) description += ", " + MILK_DESC;
		if(hasSoy()) description += ", " + SOY_DESC;
		if(hasMocha()) description += ", " + MOCHA_DESC;
		if(hasWhip()) description += ", " + WHIP_DESC;
		
		return description;
	}
	
	public double getCost() {
		double drinkCost = 0;
		
		if(hasMilk()) drinkCost += MILK_COST;
		if(hasSoy()) drinkCost += SOY_COST;
		if(hasMocha()) drinkCost += MOCHA_COST;
		if(hasWhip()) drinkCost += WHIP_COST;
		
		return drinkCost;
	}
	
	public boolean hasMilk() {
		return milk;
	}
	
	public void addMilk() {
		milk = true;
	}
	
	public boolean hasSoy() {
		return soy;
	}
	
	public void addSoy() {
		soy = true;
	}
	
	public boolean hasMocha() {
		return mocha;
	}
	
	public void addMocha() {
		mocha = true;
	}
	
	public boolean hasWhip() {
		return whip;
	}
	
	public void addWhip() {
		whip = true;
	}
}
