//Author: Samira Said
//Class ID: LR4
//Description: This program adds and subtracts objects and also stores them



package cse360assign2;

public class AddingMachine {

	private int total;
	private String stringTotal;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		stringTotal = "0";
	}
	
	//gets the total
	public int getTotal () {
		return this.total;
	}
	
	//adds the values and utilizes plus sign for string
	public void add (int value) {
		this.stringTotal += " + " + value;
		this.total += value;
	}
	
	//subtracts the values and also utilizes dash sign for string
	public void subtract (int value) {
		this.stringTotal += " - " + value;
		this.total = total - value;
	}
	
	//returns the result
	public String toString () {
		return this.stringTotal;
	}

	//clears the "cache" and sets to zero
	public void clear() {
		total = 0;
		stringTotal = "0";
	}
}
