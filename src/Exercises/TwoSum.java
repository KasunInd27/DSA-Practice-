/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
  You may assume that each input would have exactly one solution, and you may not use the same element twice.

  Examples

          Input: nums = [2,7,11,15], target = 9
          Output: [0,1]
          Output: Because nums[0] + nums[1] == 9, we return [0, 1]

          Input: nums = [3,2,4], target = 6
		  Output: [1,2]  */

package Exercises;

import java.util.Arrays;

public class TwoSum {
	
	// Function to find two numbers in the array that add up to the target
	public int[] twoSum(int[] nums, int target) {
		// Loop through each element in the array
		for(int i = 0; i < nums.length; i++) {
			// For each element, loop through the subsequent elements
			for(int j = i+1 ; j < nums.length; j++) {
				// Check if the sum of the two elements is equal to the target
				if(nums[i] + nums[j] == target) {
					// Return the indices if a match is found
					return new int[] {i, j};
				}
			}
		}
		// Throw an exception if no solution is found
		throw new IllegalArgumentException("No two sum solution found");
	}
	
	// Main method to test the twoSum function
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		
		// Test Case 1
		int[] nums1 = {2, 7, 11, 15};
		int target1 = 9;
		int[] result1 = ts.twoSum(nums1, target1);
		System.out.println("Output: " + Arrays.toString(result1));
		
		// Test Case 2
		int[] nums2 = {3, 2, 4};
		int target2 = 6;
		int[] result2 = ts.twoSum(nums2, target2);
		System.out.println("Output: " + Arrays.toString(result2));
	}

}
