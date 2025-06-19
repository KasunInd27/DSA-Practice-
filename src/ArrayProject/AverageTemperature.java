package ArrayProject;
import java.util.*;
public class AverageTemperature {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner console = new Scanner(System.in);
		
		// Prompt the user to enter the number of days for which temperatures will be recorded
		System.out.print("How many days' temperatures? ");
		int numDays = console.nextInt();
		
		 // Create an array to store the temperatures for the specified number of days
		int[] temps = new int[numDays];
		
		//Record temperatures and find average
		int sum = 0;    // Initialize a variable to store the sum of all temperatures
		// Loop through the days to record temperatures and calculate the total sum
		for(int i = 0; i < numDays; i++) {
			System.out.print("Day " + (i+1) + "'s high temp: ");
			temps[i] = console.nextInt();    // Read and store the temperature
			sum += temps[i];     // Add the temperature to the total sum
		}
		
		double average = (double)sum / numDays;
		
		//Count days above average 
		int above = 0 ;      // Initialize a counter to count the number of days above the average temperature
		
		// Loop through the recorded temperatures to find days above the average
		for(int i = 0; i < temps.length; i ++) {
			if(temps[i] > average) {
				above++;       // Increment the counter
			}
		}
		
		
		System.out.println();
		// Display the average temperature rounded to two decimal places
		System.out.println("Average Temp = " + String.format("%.2f", average));
		// Display the number of days with temperatures above the average
		System.out.println(above + " days above average");
		
		console.close();
	}

}
