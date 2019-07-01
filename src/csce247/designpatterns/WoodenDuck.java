package csce247.designpatterns;

public class WoodenDuck extends Duck {
	
	public WoodenDuck(String title) {
		super(title);
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void quack() {
		//does nothing
	}

	@Override
	public void fly() {
		//Do Nothing
	}
	
	public void display() {
		System.out.println(title + " is a wooden duck");
	}
}
