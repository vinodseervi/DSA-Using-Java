package patterns;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int row =1; row<=n; row++) {
			for(int i=1; i<=n-row; i++) {
				System.out.print(" ");
			}
			for(int j= n-row+1; j<=n; j++) {
				
				System.out.print("*");
			
			}
			for(int k=n+1; k<=n+row-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
