public class MyIntArray {

	private int[] array;
	
	public MyIntArray(int length) {
		this.array = new int[length];
	}
	
	public MyIntArray(int[] array) {
		this.array = array;
	}
	
	public void put(int position, int value) {
		this.array[position] = value;
	}
	
	public int get(int position) {
		return this.array[position];
	}
	
	public void sort() {
		//Bubble sort
		for (int i = 0; i < array.length; i++) {
			boolean isOrdered = true;
			for (int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j+1]) {
					isOrdered = false;
					int swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
			
			if(isOrdered) break;
		}
	}
	
	public int getMax() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) max = array[i];
		}
		return max;
	}
	
	public int getMin() {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < min) min = array[i];
		}
		return min;
	}
}
