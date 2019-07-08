package csce247.iterator;

import java.util.ArrayList;

public class Waitress {
	private ArrayList<MenuItem> breakfastItems;
	private MenuItem[] lunchItems;
 
	public Waitress() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		breakfastItems = pancakeHouseMenu.getMenuItems();
		lunchItems = dinerMenu.getMenuItems();
	}
	
	private void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
	// ---
 
	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		
		for(int i=0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			printMenuItem(menuItem);
		}
		
		System.out.println("\nLUNCH");
		
		for(int i=0; i< lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			printMenuItem(menuItem);
		}
		
	}
	
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
		
		for(int i=0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			if(menuItem.isVegetarian()) {
				printMenuItem(menuItem);
			}
		}
		
		System.out.println("\nLUNCH");
		
		for(int i=0; i< lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			if(menuItem.isVegetarian()) {
				printMenuItem(menuItem);
			}
		}
	}
	
	public boolean isVegetarian(String name) {
		
		for(int i=0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = breakfastItems.get(i);
			
			if(menuItem.getName().equals(name)) {
				if(menuItem.isVegetarian()) {
					return true;
				}else {
					return false;
				}
			}
			
		}
		
		for(int i=0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			
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
