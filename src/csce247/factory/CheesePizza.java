package csce247.factory;

public class CheesePizza extends Pizza {
	
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Mozzarella");
		toppings.add("Paramesan");
		toppings.add("Fetta");
	}
}
