import java.util.*;
public class q5 {
	
    public static void main(String[] args) 
    {
		int k = 3;
        Integer array[] ={1, 4, 17, 7, 25, 3, 100}; 			//Enter the array
        
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(array));
		System.out.println(k +" largest elements of the array are as follows:");
        Arrays.sort(array, Collections.reverseOrder());      //Perform reverse sort on the array and find the first k elements   
		for (int i = 0; i < k; i++){ 
			System.out.print(array[i] + " "); 				//Print the k largest elements
		}
    }     
}