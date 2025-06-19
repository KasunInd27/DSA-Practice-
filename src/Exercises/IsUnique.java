/*IsUnique / Contains Duplicate 
  Write a program to check if an array is unique or not.

  Example

      int[] intArray = {1,2,3,4,5,6};
      isUnique(intArray) // true */

package Exercises;

public class IsUnique {
	
	public boolean isUnique(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			for(int j = i+1; j < intArray.length; j++) {
				if(intArray[i] == intArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		IsUnique uni = new IsUnique();
		int[] intArray = {1,2,3,4,5,6};
		boolean result = uni.isUnique(intArray);
		System.out.println(result);
		
	}

}

/*Let’s simulate the loops:

i = 0 → j = 1, 2, 3, 4, 5

i = 1 → j = 2, 3, 4, 5

i = 2 → j = 3, 4, 5

i = 3 → j = 4, 5

i = 4 → j = 5

i = 5 → j = (nothing, ends)*/
