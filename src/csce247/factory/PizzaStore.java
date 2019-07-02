package csce247.factory;

public class PizzaStore {
	
	public PizzaStore() {}
	
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza;
		
		if(pizzaType.equals("cheese")){
			pizza = new CheesePizza();
		} else if(pizzaType.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}else if(pizzaType.equals("hawaiian")) {
			pizza = new HawaiianPizza();
		}else {
			pizza = new CheesePizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
