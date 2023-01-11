package loops;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1,a=0;
		while(i<=n) {
			int temp =i*i;
			
			if(temp<=n)
				a=i;
			if(a>=n)
				break;
			i++;
		}
		System.out.println(a);

	}

}
