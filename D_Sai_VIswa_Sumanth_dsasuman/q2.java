import java.util.*;

public class q2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in); //Use scanner for input
		System.out.println("Enter the 2 digits");
		double a =sc.nextDouble();     //Enter both the double variables.
		double b =sc.nextDouble();
		System.out.println(a>0 && a<1 && b>0 && b<1); //Print true if between 0 and 1 or False.
	}
}
