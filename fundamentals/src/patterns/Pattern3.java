package patterns;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		char a = (char)(65 + n);
		while(i<=n) {
			int j =1;
			char b =a;
			while(j<=i) {
				System.out.print(b);
				j++;
				b++;
			}
			a--;
			System.out.print("\n");
			i++;
		}

	}

}
