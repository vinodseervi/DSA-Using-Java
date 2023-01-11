package loops;
import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		while(n != 0) {
			int temp = n%10;
			a = (a*10)+temp;
			n/=10;
			
		}
		System.out.println(a);

	}

}
