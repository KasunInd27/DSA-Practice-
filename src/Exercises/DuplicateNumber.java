/*Write a function which takes integer array as a parameter and
  returns a new integer array with unique elements. (remove duplicates)

  Example
      removeDuplicates({1, 1, 2, 2, 3, 4, 5})
      Output : [1, 2, 3, 4, 5] */

package Exercises;
import java.util.Arrays;

public class DuplicateNumber {
	
	// Method to remove duplicate elements from an array
	public static int[] removeDuplicates(int[] array) {
		int n = array.length;
		int[] uniqueArray = new int[n]; // Create a temporary array to store unique elements
		int index = 0;  // Index to track the position for inserting unique elements
		
		// Outer loop to iterate through each element of the input array
		for(int i = 0; i < n; i++) {
			boolean isDuplicate = false;   // Flag to check if the current element is a duplicate
			
			// Inner loop to compare the current element with the rest of the elements
			for(int j = i+1; j < n; j++) {
				if(array[i] == array[j]) {   // If a duplicate is found
					isDuplicate = true;     // Set the flag to true
					break;    // Exit the inner loop as we found a duplicate
				}
			}
			
			// If the element is not a duplicate, add it to the unique array
			if(!isDuplicate) {
				uniqueArray[index++] = array[i];  // Place the unique element in the array and increment the index
			}
		}
		
		// Create a new array with the exact size of unique elements
		return Arrays.copyOf(uniqueArray, index);     /*Arrays.copyOf is used to trim it to the correct size 
		                                               (up to index) and return that.*/
	}
	
	public static void main(String[] args) {
		int[] inputArray = {1,1,2,2,3,4,5};
		int[] uniqueArray = removeDuplicates(inputArray);   // Call the method to remove duplicates and store the result
		
		System.out.println("Input Array: " + Arrays.toString(inputArray));
		System.out.println("Array with Unique Elements: " + Arrays.toString(uniqueArray));
		
	
	}
}
