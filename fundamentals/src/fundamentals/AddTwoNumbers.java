package fundamentals;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = s.nextInt();
		System.out.println("Enter b: ");
		b = s.nextInt();
		c = a+b;
		System.out.println("sum of a+b is : "+c+"\n");
		
		
		
		System.out.println("Enter string :");
		String str = s.next();
		char ch = str.charAt(0);
		System.out.println(ch+"\n");
		
//		char name = s.next();	

	}

}
