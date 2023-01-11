package arrays;
import java.util.Scanner;
public class ReturnArraySum {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int arraySum(int[] arr) {
		int sum =0;
		int size = arr.length;
		for(int i=0; i<size; i++)
			sum+=arr[i];
		return sum;
	}
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		int arr[] = takeInput();
		
		System.out.println(arraySum(arr));
		
	}

}
