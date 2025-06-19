/*Given an array, write a function to get first, 
  second best scores from the array and return it in new array.
  
  Array may contain duplicates.
  
  Example
         myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
         
         firstSecond(myArray) // {90, 87}
  */

package Exercises;
import java.util.Arrays;

public class BestScore {
	
	public static int[] findTopTwoScores(int[] array) {
		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		// Iterate through the array to determine the top two scores
		for(int score : array) {
			if(score > firstHighest) {
				/* If the current score is greater than the first highest,
                update the second highest to be the previous first highest*/
				secondHighest = firstHighest;
				firstHighest = score;
				
			}else if(score > secondHighest && score < firstHighest) {
				/*If the current score is greater than the second highest
                but less than the first highest, update the second highest */
				secondHighest = score;
			}
		}
		
		// Return an array containing the two highest scores
		return new int[]{firstHighest, secondHighest}; 
	}
	
	public static void main(String[] args) {
		// Input array containing scores
		int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
		
		// Call the method to find the top two scores
		int[] result = findTopTwoScores(myArray);
		
		System.out.println("Array: " + Arrays.toString(myArray));
		System.out.println("First and Second Best Scores: " + Arrays.toString(result));

	}

}
