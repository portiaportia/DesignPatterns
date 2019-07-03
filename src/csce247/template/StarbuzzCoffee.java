package csce247.template;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		CaffeineBeverage earlGray = new Tea();
		earlGray.prepareRecipe();
		
		CaffeineBeverage americano = new Coffee();
		americano.prepareRecipe();
	}
}
