package loops;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int a =0,i= 1;
		while(true) {
			int temp = (3*i)+2;
			if(temp % 4 != 0) {
				System.out.print(temp+" ");
				a++;
			}
			if(a == x)
				return;
			i++;
		}

	}

}
