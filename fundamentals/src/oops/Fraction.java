package oops;
public class Fraction {

	

	public static void main(String[] args) {
		FractionUse f1 = new FractionUse(4,6);
		f1.print();
	//	f1.increment();
		
		
		FractionUse f2 = new FractionUse(4,8);
		f2.print();
		f1.add(f2);
		f1.print();
		
		FractionUse f3 = FractionUse.add(f1,f2);
		f3.print();

	}

	

}
