/*Best Time to Buy and Sell Stock 
 
  You are given an array prices where prices[i] is the price of a given stock on the ith day. 
  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

  Example:

  Input: prices = [7, 1, 5, 3, 6, 4] 
  Output: 5 
  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */

package Exercises;

public class MaxProfit {
	
	public int maxProfit(int[] prices) {
		
		// Initialize the minimum price to a very large value
		int minPrice = Integer.MAX_VALUE;
		
		int maxProfit = 0; // Initialize the maximum profit to 0
		
		// Loop through each price in the array
		for(int price : prices) {
			// Check if the current price is less than the minimum price seen so far
			if(price < minPrice) {
				minPrice = price;
			}
			// Otherwise, calculate the potential profit if we sell at the current price
			else if(price - minPrice > maxProfit) {
				maxProfit = price - minPrice;  // Update the maximum profit if the current profit is greater
			}
		}
		
		return maxProfit;    // Return the maximum profit that can be achieved
	}
	
	public static void main(String[] args) {
		
		MaxProfit mp = new MaxProfit();
		int[] prices = {7, 1, 5, 3, 6, 4};
		
		// Call the method and print the output
		System.out.println("Max Profit: " + mp.maxProfit(prices));

	}

}
