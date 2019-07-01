package csce247.designpatterns;

public class DuckDriver {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck("Tony");
		Duck redhead = new RedHeadDuck("Bobby");
		
		mallard.display();
		mallard.quack();
		mallard.swim();
		
		redhead.display();
		redhead.quack();
		redhead.swim();
	}
	
}
