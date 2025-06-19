//What is the runtime of the below code?

package BigO_Questions;

public class PrintUnorderedPairs2 {

	public void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {                                                       
			for (int j = i+1; j < arrayB.length; j++) { 
				if (arrayA[i] < arrayB[j]) {
					System.out.print(arrayA[i] + "" + arrayB[j]+ " ");
				}    
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		PrintUnorderedPairs2 pup2 = new PrintUnorderedPairs2();
		int[] customArrayA = {3,5,7,7};
		int[] customArrayB = {2,3,5,6};
		
		pup2.printUnorderedPairs2(customArrayA, customArrayB);

	}

}

/*Time complexity: O(ab)
    a = arrayA.length
    b = arrayB.length
 */
