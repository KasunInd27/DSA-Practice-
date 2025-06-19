/*-Create a function which prints to the console the pairs from given array.
  -Find the time complexity for created method.
  
  Ex: [1,3,4,5]
  		11,13,14,15
  		31,33,34,35
  		41,43,44,45
  		51,53,54,55
 */

package BigO_Questions;

public class PrintPairs {
	
	public void printPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {                      //O(N)---|
			                                                         //       |-->O(N^2)
			for (int j = 0; j < array.length; j++) {                 //O(N)---|
				System.out.print(array[i] + "" + array[j]+ " ");     //O(1)
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		PrintPairs pp = new PrintPairs();
		int[] customArray = {1,3,4,5};
		
		pp.printPairs(customArray);
	}

}

//Time complexity: O(N^2)
