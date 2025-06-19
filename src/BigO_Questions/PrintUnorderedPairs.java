/*-What is the time complexity for the method? */
 
package BigO_Questions;

public class PrintUnorderedPairs {

	public void printUnorderedPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {                                                       
			for (int j = i+1; j < array.length; j++) {                
				System.out.print(array[i] + "" + array[j]+ " ");    
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		PrintUnorderedPairs pup = new PrintUnorderedPairs();
		int[] customArray = {1,3,4,5};
		
		pup.printUnorderedPairs(customArray);

	}

}

//Time complexity: O(N^2)