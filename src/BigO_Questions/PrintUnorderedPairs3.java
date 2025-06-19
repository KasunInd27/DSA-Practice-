//What is the runtime of the below code?

package BigO_Questions;

public class PrintUnorderedPairs3 {

	public void printUnorderedPairs3(int[] arrayA, int[] arrayB) {         
		for(int i = 0; i < arrayA.length; i++) {                           //----|                                     
			for (int j = i+1; j < arrayB.length; j++) {                    //----|--->O(ab)  
				for(int k=0; k<100000; k++) {                             //O(1)   
					System.out.print(arrayA[i] + "" + arrayB[j]+ " ");     //O(1)   
				}    
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		PrintUnorderedPairs3 pup3 = new PrintUnorderedPairs3();
		int[] customArrayA = {3,5,7,7};
		int[] customArrayB = {2,3,5,6};
		
		pup3.printUnorderedPairs3(customArrayA, customArrayB);

	}

}

/*Time complexity: O(ab)
    a = arrayA.length
    b = arrayB.length
    100000 units of work is still constant
*/
