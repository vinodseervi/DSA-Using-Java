package strings;
import java.util.*;
public class ReverseStringWordwise {
	
	public static String reverse(String str,int start, int end) {
		String str3 = "";
		for(int i=start; i<end; i++) {
			str3=str.charAt(i)+ str3;
		}
		return str3;
	}
	
	public static String RSWordwise(String str) {
		String str1 = "";
		String str2 = "";
		int size = str.length();
		str1 = reverse(str,0,size);
		int start =0;
		for(int i=0; i< size; i++) {
			
			if(str1.charAt(i) == ' ') {
				str2 += reverse(str1,start,i)+ " ";
				start = i;
			}
			else if(i == size -1) {
				str2 += reverse(str1,start,i+1);
				start = i;
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = RSWordwise(str);
		System.out.println(str);
	}

}
