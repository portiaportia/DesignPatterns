package csce247.singleton;

public class ChocolateBoiler {
	private boolean empty = true;
	private boolean boiled = false;
	private static ChocolateBoiler chocolateBoiler;
	  
	private ChocolateBoiler() {}
  
	public static ChocolateBoiler getInstance() {
		if (chocolateBoiler == null) {
			System.out.println("Creating a chocolate boiler");
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}

	// fill the boiler with a milk/chocolate mixture
	public void fill() {
		if (isEmpty()) {
			System.out.println("filling the boiler");
			empty = false;
			boiled = false;
		}
	}
 
	// drain the boiled milk and chocolate
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("draining the boiler");
			empty = true;
		}
	}
 
	// bring the contents to a boil
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("boiling");
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
	
}
