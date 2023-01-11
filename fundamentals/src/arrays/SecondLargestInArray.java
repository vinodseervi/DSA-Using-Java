package arrays;
import java.util.Scanner;
public class SecondLargestInArray {
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
	
	public static int SecondLargest1(int[] arr) {
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for(int i=0; i< size; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		for(int i=0; i< size; i++) {
			if( arr[i] < max) {
				if(secondmax < arr[i])
					secondmax = arr[i];
			}
		}
		
		return secondmax;
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
		System.out.println(SecondLargest1(arr));
		//printArray(arr);
		
	}

}