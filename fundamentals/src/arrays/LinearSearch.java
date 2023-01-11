package arrays;
import java.util.Scanner;
public class LinearSearch {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int linearS(int[] arr, int x) {
		int size = arr.length;
		for(int i =0; i<size; i++) {
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = takeInput();
		int x = s.nextInt();
		System.out.println(linearS(arr,x));
	}

}
