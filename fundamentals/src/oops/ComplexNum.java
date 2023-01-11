package oops;

public class ComplexNum {
	
	int real;
	int imagin;

	public ComplexNum(int real, int imagin) {
		this.real = real;
		this.imagin = imagin;	
	}
	
	public void plus(ComplexNum c2) {
		this.real += c2.real;
		this.imagin += c2.imagin;
	}
	
	public void multiply(ComplexNum c2) {
		int n1 = (this.real*c2.real)-(this.imagin * c2.imagin);
		int n2 = this.real* c2.imagin + this.imagin* c2.real;
		this.real = n1;
		this.imagin = n2;
	}
	
	
	
	public void print(){
		System.out.println(real + " + "+ imagin +"i");
	}

}
