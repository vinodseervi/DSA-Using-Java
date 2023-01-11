package arrays;
import java.util.*;
public class SumOfTwoArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i< size; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void reverse(int[] arr) {
		for(int i =0; i< arr.length/2; i++) {	
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1-i] = temp;
		}
		
	}
		
	
	public static void sumArray(int[] arr1, int[] arr2, int[] output) {
		reverse(arr1);
		reverse(arr2);
		int carry = 0;
		//int temp = 0;
		int size1 = arr1.length;
		int size2 = arr2.length;
		int size = (size1 < size2) ? size2 : size1;
		int[] arr = new int[1 + Math.max(arr1.length, arr2.length)];
		for(int i =0; i< size; i++) {
			int sum=0,sum1=0,sum2=0;
			if(i < size1)
				sum1 = arr1[i];
			if(i < size2)
				sum2 = arr2[i];
			
			sum = sum1 + sum2;
			
			int rem = sum%10;
			int total = rem + carry;
			if(total <10)
				arr[i] = total;
			else {
				arr[i] = total%10;
				carry = total/10;
			}
				
			
			if(sum >9)
				carry = sum/10;
			
			//temp++;
			
		}
		 arr[arr.length-1] = carry;
		reverse(arr);
		for(int i =0; i< size; i++) {
			output[i] = arr[i];
		}
		
		
		
	}
	
	
	public static void print(int arr[]) {
		int size = arr.length;
		for(int i=0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		//sumArray(arr1,arr2);
		int[] output = new int[1 + Math.max(arr1.length, arr2.length)]; 
		sumArray(arr1,arr2, output);
		print(output);
		

	}

}
