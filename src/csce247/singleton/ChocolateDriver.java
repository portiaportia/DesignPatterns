package csce247.singleton;

public class ChocolateDriver {

	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
		
		//will return the exisint boiler
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
