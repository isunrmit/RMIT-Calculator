/**
 * This implements the Calculator interface, and is used for demo of TDD creating test cases beginner level Junit
 *  * ((Week 3 ISYS1085/ISY1087))
 */

package edu.au.rmit.ct;

public class MyCalculator 
   // implements Calculator 
{
	private final int id;
	private final String name;
	private int memoryStore; // to store the last int
	
	public MyCalculator(int newId, String newName ) {
		this.id = newId;
		this.name = newName;	
	}

	public int addIntegers(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}
	
}
