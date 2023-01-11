package recursion;

public class CalculatePower {
	
	public static int calPower(int x, int n) {
		if(n == 1) {
			return x*n;
		}
		int smallOutput = calPower(x,n-1);
		int output = x * smallOutput;
		return output;
	}

	public static void main(String[] args) {
		System.out.println(calPower(3,4));
		

	}

}
