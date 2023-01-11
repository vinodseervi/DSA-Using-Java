package oops;

public class Test {
	 int a; 
	    int b; 
	    Test() 
	    {   
	        this(10, 20);   
	        System.out.print("constructor one "); 
	    } 
	    Test(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.print("constructor two "); 
	    } 
	    static int c = 10; 
	    static int d; 
	    static void fun(){ 
	        d = c * 4; 
	    } 
	   

}
