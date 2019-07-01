package csce247.designpatterns;

public class DuckDriver {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck("Tony");
		Duck redhead = new RedHeadDuck("Bobby");
		Duck rubber = new RubberDuck("Sally");
		Duck wood = new WoodenDuck("Frankie");
			
		mallard.display();
		mallard.quack();
		mallard.swim();
		mallard.fly();
		
		redhead.display();
		redhead.quack();
		redhead.swim();
		redhead.fly();
		
		rubber.display();
		rubber.quack();
		rubber.swim();
		rubber.fly();
		
		wood.display();
		wood.quack();
		wood.swim();
		wood.fly();
	}
	
}
