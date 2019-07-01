package csce247.observer.simple;

public class Mouse implements Observer{
	Subject foodBowl;
	
	public Mouse(Subject foodBowl) {
		this.foodBowl = foodBowl;
		foodBowl.registerObserver(this);
	}
	
	public void update(String food) {
		eat();		
	}
	
	public void eat() {
		System.out.println("mouse eating");
	}
}
