package array2d;
import java.util.*;
public class TotalSumontheBoundariesandDiagonals {
	
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
	
	public static void totalSum(int[][] arr) {
		int n = arr.length;
		int totalSum =0;
		for(int i=0; i<1; i++) {
			for(int j=0; j<n; j++) {
				totalSum += arr[0][j];

			}
		}
		for(int i=0; i<1; i++) {
			for(int j=0; j<n; j++) {
				totalSum += arr[n-1][j];

			}
		}
		for(int i=1; i<n-1; i++) {
			for(int j=0; j<1; j++) {
				totalSum += arr[i][0];

			}
		}
		for(int i=1; i<n-1; i++) {
			for(int j=0; j<1; j++) {
				totalSum += arr[i][n-1];

			}
		}
		if(n%2 ==0) {
			for(int i=1; i<n-1; i++) {
				totalSum += arr[i][i];
			}
		}
		else {
			for(int i=1; i<n-1; i++) {
				if(i == n/2)
					continue;
				totalSum += arr[i][i];
			}
			
		}
		for(int i=1; i<n-1; i++) {
			totalSum += arr[i][n-i-1];
		}
		
		
		System.out.println(totalSum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = input();
		totalSum(arr);
	}

}