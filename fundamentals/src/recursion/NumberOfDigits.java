package recursion;

public class NumberOfDigits {
	
	public static int numOfDigit(int n) {
		if(n == 0)
			return 0;
		
		
		return 1+numOfDigit(n/10);
	}

	public static void main(String[] args) {
		System.out.println(numOfDigit(153));
		

	}

}
