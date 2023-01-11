package strings;
import java.util.Scanner;
public class CountWords {
	
	public static int countWords(String str) {
		int count=0;
		int size = str.length();
		for(int i = 0; i<size; i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}	
		}
			
		return count;
	}
	
	public static void main(String args[]) {
		Scanner s  = new Scanner(System.in);
		String str = s.nextLine();
		int count = countWords(str);
		System.out.println(count);
	}

}
