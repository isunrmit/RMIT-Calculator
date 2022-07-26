package edu.au.rmit.ct;

interface Calculator {
	
	// no constructors for interfaces
	
	public int addIntegers(int i, int j); 
	public double divideIntegers(int i, int j) throws Exception;
	public double toPercent(double i); // 0.1 goes to 10
	public double fromPercent(double i);
	public int modulus (int i, int j); // 8 mod 4 = 0 , 10 mod 4 2
	public double getMemoryStore();  // memory of last result of calculation
	public boolean resetMemory();

}
