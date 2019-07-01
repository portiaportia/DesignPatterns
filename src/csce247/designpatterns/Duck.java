package csce247.designpatterns;

public abstract class Duck {
	protected String title;
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(String title) {
		this.title = title;
	}
	
	public abstract void display();
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("swimming");
	}
}
