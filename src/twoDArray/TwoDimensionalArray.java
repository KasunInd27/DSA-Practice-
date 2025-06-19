 package twoDArray;

public class TwoDimensionalArray {
	int arr[][] = null;
	
	//Constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col <arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	//Inserting value in the Array
	public void insertValueInArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {                            //O(1)
				arr[row][col] = value;                                          //O(1)
				System.out.println("The value is successfully inserted");       //O(1)
			}else {
				System.out.println("This cell is already occupied");            //O(1)
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");                   //O(1)
		}
	}
	
	//Time Complexity: O(1)
	//Space Complexity: O(1)
	
	//-------------------------------------
	
	//Accessing cell value from given array
	public void accessCell(int row, int col) {
		System.out.println("\nAccessing Row number: " + row + ", col number: " + col);       //O(1)
		try {
			System.out.println("Cell value is: " + arr[row][col] + "\n");                           //O(1)
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");                                //O(1)
		}
	}
	
	//Time Complexity: O(1)
	//Space Complexity: O(1)

	//-------------------------------------------------
	
	//Traverse 2D array
	public void traverse2DArray() {
		for(int row = 0; row < arr.length; row++) {               //O(m)
			for(int col = 0; col < arr[0].length; col++) {        //O(n)
				System.out.print(arr[row][col] + "  ");           //O(1)
			}
			System.out.println();                                 //O(1)
		}
	}
	//Time Complexity: O(MN)
	//Space Complexity: O(1)
	
	//---------------------------------------------
	
	//Searching a single value from the Array
	public void searchingValue(int value) {
		for(int row = 0; row < arr.length; row++) {                                           //O(m)
			for(int col = 0; col < arr[0].length; col++) {                                    //O(n)
				if(arr[row][col] == value) {                                                  //O(1)
					System.out.println("\nValue is found at row: " + row + " Col: " + col);     //O(1)
					return;
				}
			}
		}
		System.out.println("Value is not found");                                             //O(1)                                            //O(1)
	}
	
	//Time Complexity: O(MN)
	//Space Complexity: O(1)
	
	//--------------------------------------------------
	
	//Deleting a value from Array
	public void deleteValueFromArray(int row, int col) {
		try {
			System.out.println("\nSuccessfully deleted: " + arr[row][col]);       //O(1)
			arr[row][col] = Integer.MIN_VALUE;                                  //O(1)
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid for array");            //O(1)
		}
	}
	
	//Time Complexity: O(1)
	//Space Complexity: O(1)
}
