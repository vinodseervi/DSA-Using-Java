package oops;
import java.util.*;
public class BasicUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Basic s1 = new Basic("vinod",7);
//		s1.setname("vinod");
		//s1.setRollNum(8);
	//	s1.name = "vinod";
	//	s1.rollNum = 8;
		
		Basic s2 = new Basic("guman",14);
	//	s2.name = "guman";
	//	s2.rollNum = 14;
//		s2.setname("guman");
//		s2.setRollNum(14);
		
		
		System.out.println("name = "+ s1.getName() + "  rollNUmber = "+ s1.getRollNum());

	}

}
