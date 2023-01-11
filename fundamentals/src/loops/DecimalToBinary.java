package loops;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long a=0, p =1;
		while(n!=0) {
			int temp = n%2;
			a += temp*p;
			n/=2;
			p *=10;
		}
		System.out.println(a);

	}

}
