package csce247.observer.simple;

import java.util.ArrayList;

public class FoodBowl implements Subject {
	String food = "";
	ArrayList<Observer> observers;
	
	public FoodBowl() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void fillBowl(String food) {
		this.food = food;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(food);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	

}
