package strings;
import java.util.*;
public class CheckPermutation {
	
	public static boolean ispermutation(String str1, String str2) {
		int size1 = str1.length();
        int size2 = str2.length();
		for(int i=0; i<size1; i++) {
			int temp =0;
			for(int j=0; j<size2; j++) {
				if(str1.charAt(i)== str2.charAt(j))
					temp =1;
			}
			if(temp == 0)
				return false;
			
		}
		
		return true;
	}

	public static boolean ispermutation1(String str1, String str2) {
		int size = str1.length();
		int[] arr = new int[256];
		for(int i=0; i<size; i++) {
			char temp= str1.charAt(i);
			arr[temp] = arr[temp] + 1;
			
		}
		for(int i=0; i<size; i++) {
			int  temp= str1.charAt(i);
			arr[temp] =  arr[temp]+1;
			
		}
		System.out.println(arr[97]);
		for(int i=0; i<size; i++) {
			if(arr[i] != 0)
				return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string 1");
		String str1 = s.nextLine();
		System.out.println("Enter string 2");
		String str2 = s.nextLine();
		boolean output = ispermutation1(str1,str2);
		System.out.println(output);
		

	}

}
