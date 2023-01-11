package test2;
import java.util.*;
public class Print2DArray {
	
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
	
	public static void fun(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int start =0;
		int k =0;
		for(int i=0; i<row*row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[k][j]+" ");
				start++;
				
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int[][] arr = input();
		fun(arr);
	}

}