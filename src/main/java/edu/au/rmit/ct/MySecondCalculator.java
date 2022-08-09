/**
 * This implements the Calculator interface, and is used for a demo follow up to the beginner Junit class
 * ((Week 4 ISYS1085/ISY1087))
 */

package edu.au.rmit.ct;
import java.util.ArrayList;
import java.util.List;

public class MySecondCalculator implements Calculator {
	private final int id;
	private final String name;
	private double memoryStore; // to store the last integer from calculation
	private List<MySecondCalculator> series = new ArrayList<>(); // stores a list of calculators in the series below

	/* Example usage of constructors
	 * MySecondCalculator testModel = new MySecondCalculator();
	 * MySecondCalculator msc100 = new MySecondCalculator(100, "Basic Model");
	 * MySecondCalculator msc200 = new MySecondCalculator(200, "Intermediate Model"); 
	 * MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");
	 */
	
	public MySecondCalculator() {
		this.id = 999;
		this.name = "Test Model";
	}
	
	public MySecondCalculator(int newID, String newName) throws Exception {
		if(newID == 999)
			throw new Exception("Not allowed to use 999 which is for Test Model");
		this.id = newID;
		this.name = newName;
	}

	void addToSeries(MySecondCalculator newCalc) {
		series.add(newCalc);
	}

	List<MySecondCalculator> getSeries() {
		return series;
	}

	public int addIntegers(int i, int j) {
		return (int) (this.memoryStore = i + j);
	}

	public double divideIntegers(int i, int j) {
		// TODO Auto-generated method stub
		return memoryStore = i / j;
	}
 
	public double toPercent(double i) {
		// TODO Auto-generated method stub
		return memoryStore = i * 100;
	}
 
	public double fromPercent(double i) {
		return memoryStore = i / 100;
	}
 
	public int modulus(int i, int j) {
		return i % j;
	}
 
	public double getMemoryStore() {
		// TODO Auto-generated method stub
		return memoryStore;
	}

	public boolean resetMemory() {
		if (memoryStore == 0) {
			return false; // already zero.
		} else {
			memoryStore = 0;
			return true;
		}
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		
		return this.name;
	}
	
	void pretendToThink(int milliseconds) throws InterruptedException {
		System.out.println("Starting to pretend now...");
		Thread.sleep(milliseconds);
		System.out.println("Finish pretending to think...");
	}

}
