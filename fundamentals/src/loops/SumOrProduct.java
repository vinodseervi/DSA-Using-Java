package loops;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		int sum =0, mul=1;
		if(c > 2) {
			System.out.println("-1");
			return;
		}
		
		for(int i =1; i<=n; i++) {
				sum+=i;
				mul*=i;
		}
		if(c==1) {
			System.out.println(sum);
		}
		else {
			System.out.println(mul);
		}
		
		

	}

}
