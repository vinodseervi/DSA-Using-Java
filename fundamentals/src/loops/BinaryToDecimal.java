package loops;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a =1, sum =0;
		while(n!=0) {
			int temp = n%10;
			if(temp == 1)
				sum+=a;
			a*=2;;
			n/=10;
		}
		System.out.println(sum);
	}

}
