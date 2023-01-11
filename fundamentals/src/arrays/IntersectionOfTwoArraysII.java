package arrays;
import java.util.Scanner;
public class IntersectionOfTwoArraysII {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int[] Intersection(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int arr[] = new int[n], count =0;
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(arr1[i] == arr2[j]) {
					arr[count] = arr1[i];
					arr2[j]  =0;
					count++;
					break;
				}
			}
		}
		
		return arr;
		
	}
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			if(arr[i] != 0)
			 System.out.print(arr[i]);
	}
	
	public static void main(String args[]) {
		System.out.println("arrar 1");
		int arr1[] = takeInput();
		System.out.println("array 2");
		int arr2[] = takeInput();
		int arr[]  = Intersection(arr1, arr2);
		printArray(arr);
		
	}

}
