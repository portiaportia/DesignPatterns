package csce247.factory;

public class PizzaStore {
	PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza;
		
		pizza = factory.createPizza(pizzaType);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
