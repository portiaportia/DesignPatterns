package csce247.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck(String title) {
		super(title);
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println(title + " is a mallard duck");
	}
	
}
