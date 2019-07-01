package csce247.designpatterns;

public class MallardDuck {
	private String title;
	
	public MallardDuck(String title) {
		this.title = title;
	}
	
	public void quack() {
		System.out.println("quack quack quack");
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public void display() {
		System.out.println(title + " is a mallard duck");
	}
}
