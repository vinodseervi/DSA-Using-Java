package arrays;
import java.util.Scanner;
public class PrintAllPairs {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void printAllPair(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j =i; j<arr.length; j++) {
				System.out.print("["+ arr[i]+","+arr[j]+"] ");
			}
			System.out.println();
			
		}
	}
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		int arr[] = takeInput();
		
		printAllPair(arr);
		
	}

}