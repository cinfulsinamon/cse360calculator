/** 
 * Lathan McGhee  ID: 486
 * CSE 360 # 11369
 * Calculator performs basic mathematical operations.
 */

package cse360assign2;

/**
 * The Calculator class provides methods to perform 
 * basic mathematical operations on a running total.
 * Each method takes an integer input and does the requested operation
 * with the current total on the left hand side of the operator and the entered
 * value on the right hand side.
 * Methods are also provided to show the total and the history of operations.
 */

public class Calculator {

	private int total;
	
	/**
	 * Class constructor. Initializes total to zero.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the current running total.
	 * @return the running total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds a value to the current total.
	 * @param value the integer value to be added to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts a value from the current total.
	 * @param value the integer value to be subtracted from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the current total by a value.
	 * @param value the integer value to multiply the current total by
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Performs integer division on the current total.
	 * @param value the integer value to divide the total by
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Gets the history of operations performed.
	 * @return the operation history as a formatted string
	 */
	public String getHistory () {
		return "";
	}
}
