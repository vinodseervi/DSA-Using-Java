package functions;
import java.util.Scanner;
public class CalculatingNcR {
	public static int sum(int a) {
		int sum = 1;
		for(int i =1; i<=a; i++) {
			sum*=i;
		}
		//System.out.println(sum);
		return sum;
	}
	public static int ncr(int n, int r) {
		int d = n-r;
		
		
		return sum(n)/(sum(r)*sum(d));
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		System.out.println(ncr(n,r));
		
	}

}
