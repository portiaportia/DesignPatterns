package csce247.designpatterns;

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
