import java.util.*;


public class q1{
	public static void main(String args[]){
		int a,b,c,d;
		System.out.println("Enter the 4 digits");  
		Scanner sc = new Scanner(System.in);	//Use scanner to take user input
		a =sc.nextInt();						//Enter the 4 digits from user input
		b =sc.nextInt();
		c =sc.nextInt();
		d =sc.nextInt();
		if(a==b && b==c && c==d){  		//Use logical operations to compare and print the result
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
}
}
