package csce247.observer.simple;

public class Dog implements Observer {
	Subject foodBowl;
	
	public Dog(Subject foodBowl) {
		this.foodBowl = foodBowl;
		foodBowl.registerObserver(this);
	}
	
	public void update(String food) {
		if(food.equals("puppy chow")) {
			eat();
		}
	}
	
	public void eat() {
		System.out.println("dog eating");
	}
}
