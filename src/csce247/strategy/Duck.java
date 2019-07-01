package csce247.strategy;

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
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("swimming");
	}
}
