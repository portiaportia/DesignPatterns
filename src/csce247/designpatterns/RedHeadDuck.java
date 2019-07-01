package csce247.designpatterns;

public class RedHeadDuck extends Duck {

	public RedHeadDuck(String title) {
		super(title);
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println(title + " is a redheaded duck");
	}
	
}
