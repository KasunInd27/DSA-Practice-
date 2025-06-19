package twoDArray;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
		sda.insertValueInArray(0, 0, 10);
		sda.insertValueInArray(0, 1, 20);
		sda.insertValueInArray(0, 2, 30);
		sda.insertValueInArray(1, 0, 55);
		sda.insertValueInArray(2, 0, 45);
		sda.insertValueInArray(0, 0, 20);
		sda.insertValueInArray(4, 3, 20);
		
		System.out.println("\n" + Arrays.deepToString(sda.arr));
		
		//Accessing cell value from given array
		sda.accessCell(0, 1);
		
		//Traverse 2D array
		sda.traverse2DArray();
		
		//Search Array
		sda.searchingValue(30);
		sda.searchingValue(50);
		
		//Delete Array
		sda.deleteValueFromArray(0, 0);
		System.out.println(Arrays.deepToString(sda.arr));
	}
}
