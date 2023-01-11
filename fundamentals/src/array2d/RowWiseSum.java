package array2d;
import java.util.*;
public class RowWiseSum {
	
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
	
	public static void sumOfRow(int[][] arr) {
		for(int i =0; i< arr.length; i++) {
			int sum =0;
			for(int j=0; j<arr[0].length; j++) {
				sum += arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	
	public static void output(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = input();
		sumOfRow(arr);
		//output(arr);
	}

}