package oops;

public class Basic {
	 private String name;
	final private int rollNum;
	
	
	
	public Basic(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
	
//	public Basic(String name) {
//		this.name = name;
//	}
	
	public void setname(String name) {
		this.name = name;
	}
//	public void setRollNum(int rollNum) {
//		this.rollNum = rollNum;
//	}
	
	public String getName() {
		return this.name;
	}
	public int getRollNum() {
		return this.rollNum;
	}
	
	
	

}
