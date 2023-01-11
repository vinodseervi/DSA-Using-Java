package arrays;
import java.util.Scanner;
public class FindUnique {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int unique(int[] arr) {
		int unique =0;
		if(arr.length == 1)
			return arr[0];
		for(int i=0; i<arr.length-1;i++) {
			int flag =0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j] &&  i != j)
					flag =1;
					
			}
			if(flag ==0)
				unique = arr[i];
		}
		return unique;
	}
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		int arr[] = takeInput();
		
		System.out.println(unique(arr));
		
	}

}