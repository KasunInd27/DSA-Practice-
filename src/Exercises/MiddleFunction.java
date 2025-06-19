/*Write a function called middle that takes an array and returns 
  a new array that contains all but the first and last elements.
  myArray = [1, 2, 3, 4]
  middle(myArray)  # [2,3]. */

package Exercises;
import java.util.Arrays;

public class MiddleFunction {
	public static int[] middle(int[] array) {
	       if(array.length <= 2){
	           return new int[0];  //Return an empty array if the input array has 2 or fewer elements
	       }
	       
	       //Create a new array with a size of the input array length minus 2
	       int[] middleArray = new int[array.length - 2];
	       
	       //Copy the elements from the input array, excluding the first and last elements
	       int index = 1;
	       while(index < array.length - 1){
	           middleArray[index - 1] = array[index];
	           index++;
	       }
	       
	       return middleArray;
	       
	}
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4};
		System.out.println(Arrays.toString(middle(myArray)));
	}
}

/*Starts from index = 1 (second element)

Loops until the element before the last one (array.length - 1)

Each value is copied into middleArray, using index - 1 so the new array starts at index 0.*/
