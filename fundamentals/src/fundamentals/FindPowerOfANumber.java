package fundamentals;
import java.util.Scanner;
public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int sum = 1;
		for(int i=1; i<=n; i++) {
			 sum *= x;
		}
		System.out.println(sum);
	}

}
