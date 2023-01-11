package arrays;
import java.util.Scanner;
public class MergeTwoSortedArrays {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = s.nextInt();
		
		return arr;
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int size = size1 +size2, k =0;
		int arr[] = new int[size];
		for(int i =0; i< size; i++) {
			if(i < size1) {
				arr[i] = arr1[i];
			}
			else {
				arr[i] = arr2[k];
				k++;
			}
		
		}
		for(int i =0; i<size-1; i++){
        for(int j =i+1; j<size; j++){
            if(arr[j] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
	}
		
		return arr;
	}
	
	
	public static int[] mTSA(int[] arr1,int[] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int size = size1 + size2 ;
		int[] newArr = new int[size];
		int i=0,j=0,k =0;
		while(k< size)
		//for(int k=0; k<= size; k++) 
		{
			if(arr1[i] <= arr2[j]) {
				newArr[k] = arr1[i];
				k++;
				if(i <=size1-1) {
					i++;
				}	
			}
			
			if(arr2[j] <= arr1[i]) {
				newArr[k] = arr2[j];
				k++;
				if(j < size2-1) {
					j++;
				}
			
			}
			
		}
		return newArr;
	}
	
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i =0; i<size; i++)
			System.out.print(arr[i]+ " ");
	}
	
	public static void main(String args[]) {
//		System.out.println("arrar 1");
//		int arr1[] = takeInput();
//		System.out.println("arrar 2");
//		int arr2[] = takeInput();
//		int arr[] = mTSA(arr1,arr2);
//		printArray(arr);
		
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.nextLine();
		String str3=str2+str1;
		System.out.println(str3);
			
			

		
	}

}