package loops;
import java.util.Scanner;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = 1, n2 = 1, sum =0;;
		if(n == 1 ) {
			System.out.println(n1);
			return;
		}if(n == 2 ) {
			System.out.println(n2);
			return;
		}
		for(int i =3; i<=n; i++) {
			int temp = n1+n2;
			n1 = n2;
			n2 = temp;
			sum = temp;
		}
		System.out.println(sum);
		
		
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
		
	}

}
