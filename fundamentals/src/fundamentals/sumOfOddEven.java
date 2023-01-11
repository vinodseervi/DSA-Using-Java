package fundamentals;
import java.util.Scanner;
public class sumOfOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int odd =0, even =0;
		while(num != 0) {
			int rem = num%10;
			if(rem %  2 ==0)
				even+=rem;
			else
				odd+=rem;
			num/=10;
		}
		System.out.println(even+" "+odd);

	}

}
