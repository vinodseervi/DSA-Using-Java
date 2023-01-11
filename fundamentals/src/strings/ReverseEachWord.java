package strings;
import java.util.*;
public class ReverseEachWord {
	public static String reverse(String str,int start, int end) {
		String str2 = "";
		for(int i=start; i< end; i++) {
			str2 = str.charAt(i) + str2;
		}
		return str2;
	}
	
	public static String Reachword(String str) {
		String str1 = "";
		int size = str.length();
		int start =0;
		for(int i=0; i<size; i++ ) {
			if(str.charAt(i) == ' ') {
				str1 = str1 + reverse(str,start,i);
				if(start ==0)
					str1+=" ";
				start =i ;
			}
			
			
			if(i == size -1) {
				str1 += reverse(str,start,i+1);
				start=i;
			}
			
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Reachword(str);
		System.out.println(Reachword(str));

	}

}
