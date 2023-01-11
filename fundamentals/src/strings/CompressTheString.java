package strings;
import java.util.*;
public class CompressTheString {
	
	public static String compressString(String str) {
		String str1 = "";
		int count =1;
		//str1 += str.charAt(0);
		//str2 = "";
		for(int i=1; i< str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			//	str1 = str.charAt(i);
			}
//			else {
//				str1 += count + str.charAt(i);
//				count=2;
//			}
		}
		return str1;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println(compressString(str));
	}
}
