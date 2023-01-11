package patterns;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1, sum =1,temp =0, var1= 1;
		while(i<=n) {
			sum = var1;
			int j =1;
			while(j<=n) {
				System.out.print(sum);
				sum+=2;
				temp++;
				if(temp == n) {
					sum =1;
					temp =1;
				}
				j++;
			}
			var1+=2;
			System.out.println();
			i++;
		}
		
		
	}

}
