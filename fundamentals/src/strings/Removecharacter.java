package strings;
import java.util.*;
public class Removecharacter {
	public static String rC(String str, char a) {
		int size = str.length();
		String  str1 = "";
		for(int i=0; i< size; i++ ) {
			if(str.charAt(i) != a) {
				str1 += str.charAt(i);
			}
		}
		return str1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str= s.nextLine();
		System.out.println("Enter a char which remove");
		char a = s.next().charAt(0);
		String str1 = rC(str,a);
		System.out.println(str1);
	}

}