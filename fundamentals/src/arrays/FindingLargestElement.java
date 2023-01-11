package arrays;
import java.util.Scanner;
public class FindingLargestElement {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int largestElement(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int size = arr.length;
		for(int i=0; i<size; i++)
			if(arr[i] > largest)
				largest = arr[i];
		return largest;
	}
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		int arr[] = takeInput();
		
		System.out.println(largestElement(arr));
		
	}

}