package csce247.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
