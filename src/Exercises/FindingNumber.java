/*Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5  */

package Exercises;

public class FindingNumber {
	
	public void searchInArray(int[] intArray, int valueToSearch) {
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] == valueToSearch) {
				System.out.println("Value is found at the index of " + i);
				return ;
			}
		}
		System.out.println(valueToSearch + " is not found.");
	}
	
	public static void main(String[] args) {
		FindingNumber fn = new FindingNumber();
		int[] intArray = {1,2,3,4,5,6};
		fn.searchInArray(intArray, 6);
		fn.searchInArray(intArray, 8);

	}

}
