package array2d;
import java.util.*;
public class LargestRoworColumn {
	
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
	
	
	
	public static void largestSum(int[][] arr) {
		int sumrow = Integer.MIN_VALUE;
		int rowno =0;
		int row =arr.length;
		int col = arr[0].length;
//		if(row == 0 || col == 0) {
//			System.out.println("row "+rowno+" "+sumrow);
//		}
//		else {
//			
		for(int i=0; i<row ; i++) {
			int localsum =0;
			for(int j=0; j< col; j++) {
				localsum += arr[i][j]; 
			
			}
			if(sumrow < localsum)
				sumrow = localsum;
				
		}
		int sumcol = Integer.MIN_VALUE;
		int colno =0;
		for(int j=0; j<col ; j++) {
			int localsum =0;
			for(int i=0; i< row; i++) {
				localsum += arr[i][j]; 
			}
			if(sumcol < localsum)
				sumcol = localsum;
		}
		
		
		if(sumrow >= sumcol) {
			System.out.println("row "+rowno+" "+sumrow);
			
		}
		else {
			System.out.println("column "+colno+" "+sumcol);
		}
	//	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = input();
		largestSum(arr);
		
	}

}