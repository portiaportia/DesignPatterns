package csce247.adapter;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
