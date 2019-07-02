package csce247.factory;

public class PepperoniPizza extends Pizza {
	
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Thick Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onions");
		toppings.add("Grated Parmesan Cheese");
	}
}
