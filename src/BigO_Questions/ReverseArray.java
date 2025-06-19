/*-Create a method which takes an array as a parameter and reverses it.
  -Find the runtime of the created method?*/

package BigO_Questions;
import java.util.Arrays;

public class ReverseArray {
	
	public void reverse (int[] array) {
		
		// Loop from start of the array up to the middle
        // No need to go beyond half, because we swap both ends each time
		for(int i=0; i<array.length/2; i++) {          //O(N/2) -->O(N)
			
			// Calculate the index of the element at the other end of the array
			int other = array.length - i - 1;          //O(1)
			
			// Swap elements: store current element temporarily
			int temp = array[i];                       //O(1)
			
			// Assign the element from the other end to the current index
			array[i] = array[other];                   //O(1)
			
			// Assign the stored value to the other index
			array[other] = temp;                       //O(1)
		}
		System.out.println(Arrays.toString(array));    //O(N)
	}
	
	public static void main(String[] args) {
		ReverseArray rs = new ReverseArray();
		int[] customArray = {1,3,4,5};
		
		rs.reverse(customArray);

	}

}

//Time complexity: O(N)