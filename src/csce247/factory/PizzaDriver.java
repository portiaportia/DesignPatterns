package csce247.factory;

public class PizzaDriver {
	
	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		
		Pizza peppPizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(peppPizza);
		
		Pizza hawaiianPizza = pizzaStore.orderPizza("hawaiian");
		System.out.println(hawaiianPizza);
		
	}
}
