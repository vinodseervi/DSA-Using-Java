package fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int e = s.nextInt();
		int w = s.nextInt();
		while(start <= e) {
			int cel = (int)((start - 32)*(.5555555556));
			
			System.out.println(start+" "+cel);
			start+=w;
		}
	}

}
