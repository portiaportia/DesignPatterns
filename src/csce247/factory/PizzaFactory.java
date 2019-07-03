package csce247.factory;

public class PizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}else if(type.equals("hawaiian")) {
			pizza = new HawaiianPizza();
		}else {
			pizza = new CheesePizza();
		}
		
		return pizza;
	}
}
