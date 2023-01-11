package arrays;
import java.util.Scanner;
public class Sort01 {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	public static void sort1(int arr[]) {
		int size = arr.length;
		for(int i =0; i<size; i++){
			
			if(arr[i] == 0) {
				int temp = arr[i];
				for(int j=i; j>=1; j--) {
					arr[j] = arr[j-1];
				}
				//System.out.print(temp+" ");
				arr[0] = temp;
			}
		}
	}
	
	public static void sort2(int[] arr) {
		int size = arr.length,count = 0;
		for(int i=0; i<size; i++) {
			if(arr[i] == 0)
				count++;
		}
		for(int i =0; i<size; i++) {
			if(i<count)
				arr[i] = 0;
			else
				arr[i] = 1;
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
		//sort1(arr);
		sort2(arr);
		//System.out.println();
		printArray(arr);
		
	}

}