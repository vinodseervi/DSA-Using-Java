package array2d;
import java.util.*;
public class PrintLikeaWave {
	
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
	
	public static void printWave(int[][] arr) {
//		int rows = arr.length;
//        int cols = (rows == 0) ? 0 : arr[0].length;
//        
//        for(int j = 0; j < cols; j++){
//            if(j % 2 == 0){
//                for(int i = 0; i < rows; i++){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
//            else{
//                for(int i = rows-1; i >=0; i--){
//                    System.out.print(arr[i][j]+ " ");
//                }
//            }
//            
//        }
		int row = arr.length;
		int col = (row == 0) ? 0 : arr[0].length;
		
		if(row ==0 && col ==0) {
			return;
		}
		for(int j =0; j< col; j++) {
			if(j %2 !=0) {
				for(int i =0; i< row; i++) {
					System.out.println(arr[i][j]);
				}
			}
			else {
				for(int i =row-1; i>=0; i--) {
					System.out.println(arr[i][j]);
				}
		    }
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = input();
		printWave(arr);
	}

}