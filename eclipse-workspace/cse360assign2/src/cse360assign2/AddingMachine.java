//Author: Samira Said
//Project: Assignment 2
//Class ID: LR4
//URL: https://github.com/samsaid/cse360assign2
//Description: This program adds and 
		 // subtracts objects and stores to print


package cse360assign2;

public class AddingMachine {

	// Integer variable of total of the calculations
	private int total;
	// String variable of the total calculations
	private String stringTotal;
	
	// Constructor initializing the variables
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		stringTotal = "0"; 
	}
	
	// Returns the current value
	public int getTotal () {
		return this.total;
	}
	
	// Adds the values 
		// and utilizes plus sign for string
	public void add (int value) {
		this.stringTotal += " + " + value;
		this.total += value;
	}
	
	// Subtracts the values 
		// and also utilizes dash sign for string
	public void subtract (int value) {
		this.stringTotal += " - " + value;
		this.total = total - value;
	}
	
	// Returns the result of the string
	public String toString () {
		return this.stringTotal;
	}

	// Clears the "cache"/memory 
		// and sets to zero to clear for next calculation
	public void clear() {
		total = 0;
		stringTotal = "0";
	}
}
