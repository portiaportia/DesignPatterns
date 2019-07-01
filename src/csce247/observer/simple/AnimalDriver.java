package csce247.observer.simple;

public class AnimalDriver {

	public static void main(String[] args) {
		System.out.println("Let's fill the food bowl");
		
		FoodBowl foodBowl = new FoodBowl();
		Observer tipsy = new Dog(foodBowl);
		Observer fluffy = new Cat(foodBowl);
		Observer squeaky = new Mouse(foodBowl);
		
		foodBowl.fillBowl("tuna");
		
		foodBowl.fillBowl("puppy chow");
	}
}
