import java.util.*; //import the required libraries

public class q6 {
	
    public static void main(String[] args){
		int k,ctr=0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer ");
		k =sc.nextInt(); 															//Enter the value of the integer
		String c = Integer.toBinaryString(k);
		System.out.println("Its binary value is " +Integer.toBinaryString(k)); 		// Find its Binary value
		for (char ch : c.toCharArray()) {											//logic to find the number of zero bits
		ctr += ch == '0' ? 1 : 0;
		}
		System.out.println("The no of zeros " + ctr);								//Print the no of zero bits
	}
}