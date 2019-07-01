package csce247.strategy;

public class MuteQuack implements QuackBehavior {
	
	public void quack() {
		System.out.println("silence");
	}
}
