package patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int row =1; row<=n; row++) {
			for(int j=1; j<=n-row; j++) {
				System.out.print(" ");
			}
			int a = 1;
			for(int k= n-row+1; k<=n; k++) {
				
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
