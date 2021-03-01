public class q4{  
	public static void main(String args[]){  
//creating a matrix  
	int original[][]={{10,20,30},{40,50,60}};    
    
//new matrix to store the result of the operation  
	int trans[][]=new int[3][2];    
    
//Code to transpose a matrix  
	for(int i=0;i<3;i++){    
		for(int j=0;j<2;j++){    
			trans[i][j]=original[j][i];  //Interchanging rows and coloums and assign the value to a new array
		}    
	}    
  
	System.out.println("Printing Original Matrix :");  
	for(int i=0;i<2;i++){    
		for(int j=0;j<3;j++){    
			System.out.print(original[i][j]+" ");    
		}    
	System.out.println();//new line    
	}    
	System.out.println("Printing Matrix After interchange");  
	for(int i=0;i<3;i++){    
		for(int j=0;j<2;j++){    
			System.out.print(trans[i][j]+" ");    //Print Result
	}    
	System.out.println();//new line    
	}    
}
} 