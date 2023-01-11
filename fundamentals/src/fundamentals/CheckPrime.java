package fundamentals;
import java.util.Scanner;
public class CheckPrime {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = s.nextInt();
		int div = 2;
		boolean flag = true;
		while(div < number) {
			if(number%div == 0) {
				System.out.println("Number is NOt prime");
				flag = false;
			    break;
			}    
			div++;
		}
		if(flag) {
		   System.out.println("Number is prime");
	
		}
	}

}
