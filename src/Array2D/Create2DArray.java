package Array2D;

import java.util.Arrays;

public class Create2DArray {

	public static void main(String[] args) {
		//Step 1 - Declare
		int[][] int2DArray;                     //O(1)
		//Step 2 - Instantiate
		int2DArray = new int[2][2];             //O(1)
		//Step 3 - Initialize
		int2DArray[0][0] = 1;                   //O(1)--|
		int2DArray[0][1] = 2;					//O(1)--|--->O(mn)
		int2DArray[1][0] = 3;					//O(1)--|
		int2DArray[1][1] = 4;					//O(1)--|
		
		System.out.println(Arrays.deepToString(int2DArray));
		
		//In this case m is the number of rows and n is the number of columns, 
		//because here we are initializing all cells one by one.
		//Time Complexity: O(mn)
		
		//----------------------------------------------------
		
		//All together
		
		String s2DArray[][] = {{"a", "b"},{"c","d"}};     //O(1)
		
		System.out.println(Arrays.deepToString(s2DArray));
		
		//Time Complexity: O(1)
		
		//Space Complexity: O(mn) --> Because in this case we are allocating mn number of cells in the memory.
	}

}
