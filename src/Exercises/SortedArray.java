/*Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. 
  Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 
 Example:
		Input: nums = [1, 1, 2] 
		
		Output: 2 */

package Exercises;
import java.util.Arrays;

public class SortedArray {
	
	// Method to remove duplicates from a sorted array
	public int removeDuplicates(int[] nums) {
		
		// If the input array is empty, return 0 as there are no elements
		if(nums.length == 0) {
			return 0;
		}
		
		int i = 0;  // Pointer to track the position of the last unique element
		
		// Iterate through the array starting from the second element
		for(int j = 1; j < nums.length; j++) {
			
			// If the current element is different from the last unique element
			if(nums[j] != nums[i]) {
				i++;  // Move the pointer to the next position
				nums[i] = nums[j];  // Update the position with the new unique element
			}
		}
		
		// Return the count of unique elements (i + 1)
		return i+1;
	}
	
	public static void main(String[] args) {
		SortedArray sortedArray = new SortedArray();   // Create an instance of the class
		
		int[] nums = {1, 1, 2};   // Input sorted array
		
		// Call the method to remove duplicates and get the length of the unique elements
		int newLength = sortedArray.removeDuplicates(nums);   
		
		System.out.println("Input Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
		System.out.println("New Length: " + newLength);

	}

}
