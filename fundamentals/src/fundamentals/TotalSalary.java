package fundamentals;
import java.util.*;
import java.lang.Math;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basicSalary = s.nextInt();
		char grade = s.next().charAt(0);
		double hra = basicSalary * 0.2;
		double da = basicSalary * 0.5;
		double pf = basicSalary * 0.11;
		double totalSalary = basicSalary + hra + da -pf;
		if(grade == 'A') {
			System.out.println(Math.round(totalSalary+1700));
		}
		else if(grade == 'B') {
			System.out.println(Math.round(totalSalary+1500));
		}
		else {
			System.out.println(Math.round(totalSalary+1300));
		}
		
		

	}

}
