package functions;
import java.util.Scanner;
public class FibonacciNumber {

	public static void fibo(int n) {
		int n1 = 1, n2 =1;
		if(n == n1 || n == n2)
			System.out.println("true");
		
		for(int i =2; i<=5000; i++) {
			int temp = n1+n2;
			n1= n2;
			n2 = temp;
			if(n == temp) {
				System.out.println("true");
				return;
			}
		}
		
		System.out.println("flase");
	
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n  =s.nextInt();
		fibo(n);
		
	}

}
