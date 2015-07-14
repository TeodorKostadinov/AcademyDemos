package net.tsvm.demo.lists;

public class MyStaticList {
	private static final int INITIAL_CAPACITY = 3; 
	private Object[] elements = new Object[INITIAL_CAPACITY];
	private int count = 0;
	
	public void add(Object element) {
		if (count >= elements.length) {
			extendElements();			
		}
		elements[count] = element;
		count++;
	}
	
	public void add(Object element, int position) {
		if (count >= elements.length) {
			extendElements();
		}
		
		Object previousElement = elements[position];
		elements[position] = element;
		count++;
		
		for (int i = position + 1; i < count; i++) {
			Object temp = elements[i];
			elements[i] = previousElement;
			previousElement = temp;
		}
	}
	
	public boolean remove(Object element) {
		int pos = getPosition(element);
		
		if (pos >= 0) {
			for (int i = pos; i < count; i++) {
				elements[i] = elements[i+1];
			}
			count--;
			return true;
		}
		
		return false;
	}
	
	public int getPosition(Object element) {
		for (int i = 0; i < count; i++) {
			if ((elements[i] != null && elements[i].equals(element))
					|| (element == null && elements[i] == null)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Object get(int position) {
		if (position >= 0 && position < count) {
			return elements[position];
		}
		
		// Normally, an exception should be thrown here.
		System.out.println("Given position is not valid for the list.");		
		return null;
	}
	
	public int count() {
		return this.count;
	}
	
	private void extendElements() {
		Object[] extendedArray = new Object[elements.length * 2];
		for (int i = 0; i < elements.length; i++) {
			extendedArray[i] = elements[i];
		}
		elements = extendedArray;
	}
	
	
	
}
