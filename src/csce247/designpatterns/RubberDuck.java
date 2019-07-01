package csce247.designpatterns;

public class RubberDuck extends Duck {

	public RubberDuck(String title) {
		super(title);
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void quack() {
		System.out.println("squeak squeak squeak");
	}

	@Override
	public void fly() {
		//Do Nothing
	}
	
	public void display() {
		System.out.println(title + " is a rubber duck");
	}
}
