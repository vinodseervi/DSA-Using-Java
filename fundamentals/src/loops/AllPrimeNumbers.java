package loops;
import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = s.nextInt();
		
		for(int i =2; i<=number; i++) {
			int div = 2;
			boolean flag = true;
			while(div < i) {
				if(i%div == 0) {
					
					flag = false;
					break;
				}    
				div++;
			}
			if(flag) {
				System.out.println(i);
	
			}
		}
	}

}
