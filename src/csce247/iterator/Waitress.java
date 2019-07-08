package csce247.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
 
	public Waitress() {
		pancakeHouseMenu = new PancakeHouseMenu();
		dinerMenu = new DinerMenu();
	}
 
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			printMenuItem(menuItem);
		}
	}
	
	public void printVegetarianMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
		printVegetarianMenu(pancakeIterator);
		
		System.out.println("\nLUNCH");
		printVegetarianMenu(dinerIterator);
	}
	
	private void printVegetarianMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			
			if(menuItem.isVegetarian()) {
				printMenuItem(menuItem);
			}
		}
	}
	
	private void printMenuItem(MenuItem item) {
		System.out.print(item.getName() + ", ");
		System.out.print(item.getPrice() + " -- ");
		System.out.println(item.getDescription());
	}
	
	public boolean isVegetarian(String name) {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		return isVegetarian(pancakeIterator, name) || isVegetarian(dinerIterator, name);
	}
	
	private boolean isVegetarian(Iterator iterator, String name) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			
			if(menuItem.getName().equals(name)) {
				if(menuItem.isVegetarian()) {
					return true;
				}else {
					return false;
				}
			}
			
		}
		
		return false;
	}

}
