package fundamentals;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a =1;
		while(a<=10) {
			System.out.println(a*n);
			a++;
		}

    }

}
