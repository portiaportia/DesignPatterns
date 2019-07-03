package csce247.factory;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String pizzaType) {
		if(pizzaType.equals("cheese")) {
			return new NYCheesePizza();
		}else if(pizzaType.equals("pepperoni")) {
			return new NYPepperoniPizza();
		}else if(pizzaType.equals("hawaiian")) {
			return new NYHawaiianPizza();
		}
		
		return null;
	}
	
}
