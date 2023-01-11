package strings;
import java.util.*;
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr1 = {1,2};
		int[] arr2 = {1,2};
		
		String str1 = "vinod";
		String str2 = "vinod";
		String str3 = new String("vinod");
		if(str1 == str3)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
	}

}
