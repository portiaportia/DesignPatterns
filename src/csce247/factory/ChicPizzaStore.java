package csce247.factory;

public class ChicPizzaStore extends PizzaStore {

	public Pizza createPizza(String pizzaType) {
		if(pizzaType.equals("cheese")) {
			return new ChicCheesePizza();
		}else if(pizzaType.equals("pepperoni")) {
			return new ChicPepperoniPizza();
		}else if(pizzaType.equals("hawaiian")) {
			return new ChicHawaiianPizza();
		}
		
		return null;
	}
	
}
