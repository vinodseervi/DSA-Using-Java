package arrays;
import java.util.Scanner;
public class FindDuplicate {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int duplicateNumber(int arr[]) {
    	if(arr.length == 1)
			return arr[0];
		for(int i=0; i<arr.length;i++) {
		
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j] &&  i != j)
					return arr[i];
					
			}
			
		}
		return -1;
    }
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		int arr[] = takeInput();
		
		System.out.println(duplicateNumber(arr));
		
	}

}