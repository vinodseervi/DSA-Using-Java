package strings;
import java.util.*;
public class AllSubstrings {
	
	public static void substrings(String str) {
		int size = str.length();
		String str1 = "";
		for(int i=0; i<size; i++) {
			str1 = "";
			for(int j=i; j<size; j++) {
				str1 += str.charAt(j);
				System.out.println(str1);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		substrings(str);
	}
}
