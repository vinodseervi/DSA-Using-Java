package strings;
import java.util.*;
public class HighestOccuringCharacter {
	
	public static char occuringCharacter(String str) {
		char ch = ' ';
		int size = str.length();
		int[] arr = new int[256];
		
		for(int i=0; i< size;i++) {
			arr[str.charAt(i)]++;
		}
		int max = -1;
		for(int i=0; i< size; i++) {
			if(max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		
		return ch;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = occuringCharacter(str);
		System.out.println(ch);

	}

}
