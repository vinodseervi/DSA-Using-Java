package test1;
import java.util.Scanner;
public class ZerosAndStarsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=n; j>=1; j--) {
				if(j==i)
					System.out.print("*");
				else
					System.out.print("0");
			}
			
			System.out.print("*");
		
		 
			for(int j=(n*2)+1; j>=n+2; j--) {
				if(j == (n*2)+2-i)
					System.out.print("*");
				else
					System.out.print("0");
			}
			
			System.out.println();
		
		

		}

	}
}
