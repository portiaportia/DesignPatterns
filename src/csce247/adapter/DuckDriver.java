package csce247.adapter;

public class DuckDriver {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyDuck = new TurkeyAdapter(wildTurkey);
	
		System.out.println("The Mallard Duck:");
		mallardDuck.quack();
		mallardDuck.fly();
		
		System.out.println("The Turkey Duck:");
		turkeyDuck.quack();
		turkeyDuck.fly();
	}
}
