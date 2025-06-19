/*Rotate Matrix
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.  */

package Exercises;

import java.util.Arrays;
public class RotateMatrix {
	
	// Method to rotate the NxN matrix by 90 degrees in place
	public void rotateMatrix(int[][] matrix) {
		// Return immediately if the matrix is empty or not square
		if(matrix.length == 0 || matrix.length != matrix[0].length) return;
		
		int n = matrix.length;  // Get the size of the matrix (NxN)
		
		// Process the matrix layer by layer, starting from the outermost layer
		for(int layer = 0; layer < n/2; layer++) {
			
			int first = layer;          // Index of the first element in the layer
			int last = n - 1 - layer;   // Index of the last element in the layer
			
			// Rotate elements in the current layer
			for(int i= first; i < last; i++) {
				int offset = i - first;        // Offset within the current layer
				int top = matrix[first][i];    // Save the top element
				
				// Move the left element to the top
				matrix[first][i] = matrix[last - offset][first];
				
				// Move the bottom element to the left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				// Move the right element to the bottom
				matrix[last][last-offset] = matrix[i][last];
				
				// Move the saved top element to the right
				matrix[i][last] = top;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		RotateMatrix rm = new RotateMatrix(); // Create an instance of RotateMatrix
		
		// Define a 3x3 matrix
		int[][] matrix = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
		};
		
		// Rotate the matrix by 90 degrees
		rm.rotateMatrix(matrix);
		
		// Print the rotated matrix
		System.out.println(Arrays.deepToString(matrix));

	}

}
