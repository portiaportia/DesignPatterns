package csce247.factory;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	
	public void bake() {
		System.out.println("Baking " + name);
	}
	
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	public void box() {
		System.out.println("Boxing " + name);
	}
	
	public String toString() {
		String result = "";
		result += "-------- " + name + " --------\n";
		result += dough + "\n";
		result += sauce + "\n";
		
		for(String topping : toppings) {
			result += topping + "\n";
		}
		
		return result;
	}
}
