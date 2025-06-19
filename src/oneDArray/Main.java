package oneDArray;

public class Main {

	public static void main(String[] args) {
		//Call function of InsertArray class 
		SingleDimensionalArray sda = new SingleDimensionalArray(10);
		sda.insert(0, 5);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(1, 30);
		sda.insert(12, 120);
				
		//--------------------------------------------
				
		//Accessing Elements in Array
		var firstElement = sda.arr[0];         //O(1)
		System.out.println("First element: " + firstElement);
		var thirdElement = sda.arr[2];         //O(1)
		System.out.println("Third element: " + thirdElement);
				
		//Time complexity: O(1)
		//Space complexity: O(1)
				
		//--------------------------------------------
		
		//Array Traversal
		System.out.println("Array traversal");
		sda.traverseArray();
		
		//Search Array
		sda.searchInArray(10);
		sda.searchInArray(20);
		sda.searchInArray(40);
		
		//Delete Array
		sda.deleteValue(0);
		System.out.println(sda.arr[0]);
		
	}

}
