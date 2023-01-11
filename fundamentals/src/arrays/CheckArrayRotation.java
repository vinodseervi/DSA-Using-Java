package arrays;
import java.util.Scanner;
public class CheckArrayRotation {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	public static int SecondLargest(int[] arr) {
		int size = arr.length;
		for(int i =0; i< size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[size-2];
	}
	
	public static int ArrayRotation(int[] arr) {
		int size = arr.length;
		int count =0;
		for(int i=0; i< size-1; i++) {
			if(arr[i] < arr[i+1])
				count++;
			
		}
		
		return count;
	} 
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.print(arr[i]+ " ");
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("arrar 1");
		int arr[] = takeInput();
		System.out.println(ArrayRotation(arr));
		//printArray(arr);
		
	}

}