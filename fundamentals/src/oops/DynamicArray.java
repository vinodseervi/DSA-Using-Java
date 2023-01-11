package oops;

public class DynamicArray {
	
	private int data[];
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];	
		nextElementIndex =0;
	}
	
	public int size() {
		return nextElementIndex;
	}
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	public void set(int index, int newData) {
		if( index >= nextElementIndex) {
			return;
		}
		
		data[index] = newData;
		
	}
	
	public int get(int index) {
		if( index >= nextElementIndex) {
			return -1;
		}
		
		return this.data[index];
	}
	
	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2* temp.length];
	
		for(int i =0; i < temp.length; i++) {
			data[i] = temp[i];
		}
		
	}
	
	
	public void add(int newData) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		
		data[nextElementIndex] = newData;
		nextElementIndex++;
	}
	
	public int removeLast() {
		
		
		nextElementIndex --;
		return this.data[nextElementIndex];
		
	}
	
	
	
	 

}
