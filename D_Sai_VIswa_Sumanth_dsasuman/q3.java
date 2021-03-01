import java.util.*; //reqquired libraries


public class q3 {
	public static void main(String[] args){
		boolean[][] array = {{true, false, true},{false, true, false}}; //Provided input
		//Find no of rows and coloumns
		int rowlen = array.length;
		int collen = array[0].length;
		
		for (int i = 0; i < rowlen; i++){         //Convert true to t and false to f and print its substitute
			for (int j = 0; j < collen; j++){
				if (array[i][j]) {
					System.out.print(" t ");
				} else {
					System.out.print(" f ");
				}	
			}
			System.out.println();
		}	
    }
}