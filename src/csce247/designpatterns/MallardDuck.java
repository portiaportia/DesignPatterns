package csce247.designpatterns;

public class MallardDuck extends Duck {
	
	public MallardDuck(String title) {
		super(title);
	}

	public void display() {
		System.out.println(title + " is a mallard duck");
	}
	
}
