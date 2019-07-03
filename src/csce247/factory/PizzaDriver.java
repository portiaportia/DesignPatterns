package csce247.factory;

public class PizzaDriver {
	
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		Pizza nyPeppPizza  = nyPizzaStore.orderPizza("pepperoni");
		System.out.println(nyPeppPizza);
		
		PizzaStore chicPizzaStore = new ChicPizzaStore();
		
		Pizza chicPeppPizza  = chicPizzaStore.orderPizza("pepperoni");
		System.out.println(chicPeppPizza);
		
	}
}
