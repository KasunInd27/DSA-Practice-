/*Write Java function called findMissingNumberInArray that takes an integer array containing n-1 
 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

 Example

        myArray = {1,2,3,4,6}
        findMissingNumberInArray(myArray, 6) // 5
 Hint:
        Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers. */

package Exercises;
import java.util.Arrays;

public class MissingNumber {

	public static int findMissingNumberInArray(int[] array) {
		int n = array.length + 1;    // Total numbers (including the missing one)
		int expectedSum = (n * (n + 1)) / 2;    // Sum of first n natural numbers
		int actualSum = 0;
		
		//Calculate the sum of elements in the array
		for(int number : array) {
			actualSum += number;
		}
		
		// The difference between the expected sum and the actual sum gives the missing number
		return expectedSum - actualSum;
	}
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,6};
		int missingNumber = findMissingNumberInArray(myArray);
		
		System.out.println("Input Array: " + Arrays.toString(myArray));
		System.out.println("Missing Number: " + missingNumber);
		
	}

}
