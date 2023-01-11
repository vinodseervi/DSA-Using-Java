package test1;
import java.util.Scanner;
public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0, a = n,pov=0;
		
		
		while(a!=0) {
			sum++;
			a/=10;
		}

		a=n;
		
		
		
		while(a!=0) {
			int temp = a%10;
			int temp1=1;
			for(int i =1; i<=sum; i++) {
				temp1*=temp;
			}
			pov +=temp1;
			
		
			a/=10;
		}
		if(n == pov)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
