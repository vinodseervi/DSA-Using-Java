package array2d;
import java.util.*;
public class LargestColumnSum {
	
	public static int[][] input() {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter row no :");
		int row = s.nextInt();
		System.out.println("Enter col no :");
		int col = s.nextInt();
		System.out.println("Enter array values :");
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
		
	}
	
	
	public static void lcolumnSum(int[][] arr) {
		int sum = Integer.MIN_VALUE;
		for(int j=0; j<arr[0].length ; j++) {
			int localsum =0;
			for(int i=0; i< arr.length; i++) {
				localsum += arr[i][j]; 
			}
			if(sum < localsum)
				sum = localsum;
		}
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = input();
		lcolumnSum(arr);
		
	}

}