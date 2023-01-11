package functions;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {

	public static void fahTocel(int s, int e, int w) {
		for(int i =s; i<=e; i=i+w) {
			int temp = i-32;
			int rel =(int)(temp * (float)5/9);
			
			System.out.println(i +"\t"+ rel );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		int s  =sa.nextInt();
		int e = sa.nextInt();
		int w = sa.nextInt();
		
		fahTocel(s,e,w);

	}

}
