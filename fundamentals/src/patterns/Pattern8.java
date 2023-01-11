package patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int a=n/2;


		 int i=1;
		   while(i<=a+1) {
		 	  int j=1;
		 	  while(j<=a+1-i) {
		 		  System.out.print(" ");
		 		  j++;
		 	  }
		 	  int k=1;
		 	  while(k<=i) {
		 		  System.out.print('*');
		 		  k++;
		 	  }
		 	  
		 	  int l=-1;
		 	  while(l>-i) {
		 		  System.out.print('*');
		 		  l--;
		 	  }
		 	  System.out.println();
		 	  i++;
		   }
		   
		 int m=1;
		   while(m<=a) {
		 	  int o=1;
		 	  while(o<=m) {
		 		  System.out.print(" ");
		 		  o++;
		 	  }
		 	  int p=1;
		 	  while(p<=a-m+1) {
		 		  System.out.print('*');
		 		  p++;
		 	  }
		 	  int q=1;
		 	  while(q<=a-m) {
		 		  System.out.print('*');
		 		  q++;
		 	  }
		 	  System.out.println();
		 	  m++;
		   }

	}

}