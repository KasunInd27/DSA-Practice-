/*Given 2D array calculate the sum of diagonal elements.

  Example
     myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
     sumDiagonalElements(myArray2D) # 15   */

package Exercises;

public class twoDArray {
	
	public static int sumDiagonalElements(int[][] array) {
		int sum = 0;
		
		//Iterate over the rows, assuming it's a square matrix
		for(int i = 0; i < array.length; i++) {
			sum += array[i][i];   //Add the primary diagonal element
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[][] myArray2D = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//Call the function and print the result
		int result = sumDiagonalElements(myArray2D);
		System.out.println("Sum of diagonal elements: " + result);  

	}

}
