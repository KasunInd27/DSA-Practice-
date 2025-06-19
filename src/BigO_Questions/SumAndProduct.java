/*-Create a function which calculates the sum and product of elements of array.
  -Find the time complexity for created method.*/

package BigO_Questions;

public class SumAndProduct {
	
	public void SPofArray(int[] array) {
		int sum = 0;                                 //O(1)
		int product = 1;							 //O(1)
		
		for(int i=0; i<array.length; i++) {          //O(N)
			sum += array[i];                         //O(1)
		}
		
		for(int i=0; i<array.length; i++) {          //O(N)
			product *= array[i];                     //O(1)
		}
		
		System.out.println(sum + ", " + product);    //O(1)
	}

	public static void main(String[] args) {
		SumAndProduct sap = new SumAndProduct();
		int[] customArray = {1,3,4,5};
		
		sap.SPofArray(customArray);

	}

}

//Time complexity: O(N)
