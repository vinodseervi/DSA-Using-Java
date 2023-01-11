package oops;

public class Polynomial {
	
	private int data[];
	private int nextElementIndex;
	
	public Polynomial() {
		data = new int[5];	
		nextElementIndex =0;
	}
	
	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2* temp.length];
	
		for(int i =0; i < temp.length; i++) {
			data[i] = temp[i];
		}
		
	}
	
	
	public void setCoefficient(int degree, int coeff){
		

		
	}
	
	
	public void print(){
		
	}

	
	
//	public Polynomial add(Polynomial p){
//
//		
//	}
//	
//	
//	public Polynomial subtract(Polynomial p){
//			
//	}
//	
//	
//	public Polynomial multiply(Polynomial p){
//		
//	}

}
