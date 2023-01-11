package strings;
import java.util.*;
public class StringPalindrome {
	
	
	public static boolean palindrome(String str) {
		int size = str.length();
		for(int i=0; i< size/2; i++) {
			if(str.charAt(i) != str.charAt(size-1-i)){
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(palindrome(str));
	}

}
