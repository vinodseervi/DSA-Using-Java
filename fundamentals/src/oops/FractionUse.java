package oops;

public class FractionUse {
	
	private int numerator;
	private int denominator;

	public FractionUse(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd =1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2; i< smaller; i++) {
			if(numerator % i ==0 && denominator % i ==0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
		
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int denominator) {
		if(denominator == 0) {
			return;
		}
		this.denominator = denominator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	public void print() {
		System.out.println(numerator +"/" +denominator);
	}
	
	public void add(FractionUse f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static FractionUse add(FractionUse f1, FractionUse f2) {
		int num =  f1.numerator * f2.denominator + f2.denominator * f2.numerator;
		int deno = f1.denominator * f2.denominator;
		FractionUse f3 = new FractionUse(num, deno);
		return f3;
		
		
	}
	
	
	
	

}
