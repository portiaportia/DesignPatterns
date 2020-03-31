package csce247.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList<MenuItem> items;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	public MenuItem next() {
		if(!hasNext())return null;
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}
	
	public boolean hasNext() {
		return items.get(position) != null && position < items.size();
	}
}
