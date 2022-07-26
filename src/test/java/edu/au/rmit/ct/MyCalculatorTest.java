package edu.au.rmit.ct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up Before Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setting up before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tearing Down After each test");
	}

	@Test
	void test() { //Generic test fail
		fail("Not yet implemented");
	}
	
	// Some Suggested tests below
	
	/*
	 *  @Test
	 *  void testAdditionOfIntegersSimple() {}
	 */

	/*
	 *  @Test
	 *  void testDivideTwoIntegers() {}
	 */

	/*
	 *  @Test
	 *  void testModulusTwoIntegers() {}
	 */
	
	/*
	 *  @Test
	 *  void testExpectedExceptionWhenDivideByZero() {}
	 */
	
 
	

}
