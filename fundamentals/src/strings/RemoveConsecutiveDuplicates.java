package strings;
import java.util.*;
public class RemoveConsecutiveDuplicates {
	public static String rCD(String str) {
		int size = str.length();
		String  str1 = "";
		str1 += str.charAt(0);
		char pre = str.charAt(0);
		for(int i=1; i< size; i++) {
			if(pre != str.charAt(i)) {
				str1 +=str.charAt(i);
				pre = str.charAt(i);
			}
		}
		return str1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str= s.nextLine();
		String str1 = rCD(str);
		System.out.println(str1);
	}

}
