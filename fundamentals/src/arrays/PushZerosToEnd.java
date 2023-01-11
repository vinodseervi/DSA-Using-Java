package arrays;
import java.util.Scanner;
public class PushZerosToEnd {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void pushZeros(int[] arr) {
		int size = arr.length;
		int[] newArr = new int[size];
		int k =0;
		for(int i=0; i<size; i++) {
			if(arr[i] != 0 ) {
				newArr[k] = arr[i];
				k++;
			}
		}
		for(int i =0; i< size; i++)
			arr[i] = newArr[i];
			
	
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
		pushZeros(arr);
		printArray(arr);
		
	}

}