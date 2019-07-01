package csce247.designpatterns;

public abstract class Duck {
	protected String title;
	
	public Duck(String title) {
		this.title = title;
	}
	
	public abstract void display();
	
	public void quack() {
		System.out.println("quack quack quack");
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void fly() {
		System.out.println("flying");
	}
}
