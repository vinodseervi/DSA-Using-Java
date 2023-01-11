package arrays;
import java.util.Scanner;
public class ArrangeNumbersInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static void arrangeNumber(int[] arr, int n) {
		
		int odd = 1, even;
		if(n%2 == 0)
			even = n;
		else
			even = n-1;
		if(n%2 ==0) {
			for(int i =1; i<=n; i++) {
				if(i<=n/2) {
					arr[i-1] = odd;
					odd+=2;
				}	
				else {
					arr[i-1] = even;
					even-=2;
				}	
			}
		}
		else {
			for(int i =1; i<=n; i++) {
				if(i<=n/2+1) {
					arr[i-1] = odd;
					odd+=2;
				}	
				else {
					arr[i-1] = even;
					even-=2;
				}	
			}
		}
		
			
		
		
	}
	
	
	
	
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.println(arr[i]);
	}	
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//int arr[] = takeInput();
		int n = s.nextInt();
		int arr[] = new int[n];
		int arr1[][] = new int[5][5];		
		arrangeNumber(arr,n);
		//printArray(arr);
		System.out.println(arr1);
		
	}

}