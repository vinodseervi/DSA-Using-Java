package fundamentals;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a =2;
		while(a<num) {
			if(num%a == 0) {
				System.out.print(a+" ");
			}
			a++;
		}

	}

}
