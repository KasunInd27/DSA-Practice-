/*You are given two integer arrays. Write a program to check if they are permutations of each other.

Example

	int[] array1 = {1,2,3,4,5};
	int[] array2 = {5,1,2,3,4};
	permutation(array1, array2)

Output

	 true   */

package Exercises;

public class Permutation {
	
	public boolean permutation(int[] array1, int[] array2) {
		if(array1.length != array2.length) {
			return false;
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int mul1 = 0;
		int mul2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
			sum2 += array2[i];
			mul1 *= array1[i];
			mul2 *= array2[i];
		}
		
		if(sum1 == sum2 && mul1 == mul2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Permutation pm = new Permutation();
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4};
		
		boolean result = pm.permutation(array1, array2);
		System.out.println(result);

	}

}
