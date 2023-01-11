package arrays;
import java.util.Scanner;
public class InsertionSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void insertion(int[] arr) {
		int size = arr.length;
		for(int i =1; i<size; i++) {
			int j = i -1;
			int temp = arr[i];
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.print(arr[i]+ " ");
	}
	
	public static void main(String args[]) {
		System.out.println("arrar 1");
		int arr[] = takeInput();
		insertion(arr);
		printArray(arr);
		
	}

}