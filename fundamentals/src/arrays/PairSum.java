package arrays;
import java.util.Scanner;
public class PairSum {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void pairSum(int arr[],int x) {
		int size = arr.length, sum=0;
		for(int i=0; i<size; i++) {
			for(int j =i+1; j<size; j++) {
				if(arr[i] +arr[j] == x) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
	}
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			if(arr[i] != 0)
			 System.out.print(arr[i]);
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("arrar 1");
		int arr[] = takeInput();
		System.out.println("x value : ");
		int x = s.nextInt();
		pairSum(arr,x);
		
	}

}
