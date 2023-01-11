package strings;
import java.util.*;
public class ReverseString {
	
	public static String reverse(String str) {
		int size = str.length();
		 String  reversestr = "";
		for(int i=0; i< size; i++) {
			 reversestr = str.charAt(i) + reversestr;
		}
		//System.out.println(reversestr);
		return reversestr;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverse(str));
	}

}
