package csce247.observer.weather;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
