package oneDArray;

public class SingleDimensionalArray {
	int arr[] = null;
	
	public SingleDimensionalArray(int sizeOfArray) {
		arr = new int [sizeOfArray];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {                  //O(1)
				arr[location] = valueToBeInserted;                    //O(1)
				System.out.println("Successfully inserted");          //O(1)
			}else {
				System.out.println("This cell is already occupied");  //O(1)
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array!");     //O(1)
		}
	}
	
	//Time complexity: O(1)
	
	//----------------------------------------------------------
	
	//Array Traversal
	public void traverseArray() {
		try {
			for(int i = 0; i < arr.length; i++) {              //O(N)
				System.out.print(arr[i] + " ");              //O(1)
			}
			System.out.println();
		}catch (Exception e) {
			System.out.println("Array no longer exists!");     //O(1)
		}
	}
	
	//Time complexity: O(N)
	//Space complexity: O(1) --> The space complexity for this method is O(1), 
	//because here an extra memory is not required to perform this operation.
	//We are just printing out the values to the console. So extra memory is not required.
    //So that's why it take O(1) space complexity.
	
	//---------------------------------------------------------
	
	//Search for an element in the given Array
	public void searchInArray(int valueToSearch) {
		for(int i = 0; i < arr.length; i++) {                                //O(N)
			if(arr[i] == valueToSearch) {                                    //O(1)
				System.out.println("Value is found at the index of " + i);   //O(1)
				return;
			}
		}System.out.println(valueToSearch + " is not found");                //O(1)
		
	}
	
	//Time complexity: O(N)
	//Space complexity: O(1) --> //because here an extra memory is not required to perform this operation.
	
	//-------------------------------------------------------------
	
	//Delete value from Array
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex] = Integer.MIN_VALUE;                                       //O(1)
			System.out.println("The value has been deleted successfully");                     //O(1)
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");     //O(1)
		}
	}
	
	//Time complexity: O(1)
	//Space complexity: O(1)
}
