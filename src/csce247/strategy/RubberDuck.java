package csce247.strategy;

public class RubberDuck extends Duck {

	public RubberDuck(String title) {
		super(title);
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println(title + " is a rubber duck");
	}
}
