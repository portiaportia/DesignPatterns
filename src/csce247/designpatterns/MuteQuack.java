package csce247.designpatterns;

public class MuteQuack implements QuackBehavior {
	
	public void quack() {
		System.out.println("silence");
	}
}
