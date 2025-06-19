/*How to find maximum product of two integers in the array where all elements are positive.

Example

		int[] intArray = {10,20,30,40,50};
		maxProduct(intArray) // (40,50)  */

package Exercises;

public class MaxProduct {
	
	// Method to find the pair of numbers with the maximum product
	public String maxProduct(int[] intArray) {
		int maxProduct = 0;
		String pairs = "";      // String to store the pair that gives the max product
		
		// Outer loop: Go through each element
		for(int i = 0; i < intArray.length; i++) {
			// Inner loop: Go through all elements after index i
			for(int j = i+1; j < intArray.length; j++) {
				if(intArray[i] * intArray[j] > maxProduct) {
					maxProduct = intArray[i] * intArray[j];
					// Store the current pair as a string like "40,50"
					pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
				}
			}
		}
		return pairs;   // Return the pair that produced the highest product
		
	}
	
	public static void main(String[] args) {
		MaxProduct mp = new MaxProduct();
		int[] intArray = {10, 20, 30, 40, 50};
		String pairs = mp.maxProduct(intArray);
		System.out.println(pairs);

	}

}
