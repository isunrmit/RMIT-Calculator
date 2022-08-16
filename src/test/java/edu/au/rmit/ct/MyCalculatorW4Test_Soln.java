package edu.au.rmit.ct;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;

public class MyCalculatorW4Test_Soln {

    @Test
    @DisplayName("Example of testing the default constructor with no params")
    void checkDefaultConstructor() {
        MySecondCalculator msc999 = new MySecondCalculator();
        // check ID and name with asserts
        // fail("Not implemented yet");
        assertEquals(999 , msc999.getId());
        assertEquals( "Test Model", msc999.getName());

    }

    @Test
    @DisplayName("Example of AssertTrue @DisplayName / AssertFalse and Reset Memory")
    void checkBooleanReturnResetMemory() throws Exception {
        MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");

        //
        // fail("Not implemented yet");

        // Step 1. reset memory of the calculator. Use an assert method to check this was done correctly
        assertFalse(msc300.resetMemory());

        // Step 2. check value of adding 29 + 1. you should get an expected result, also
        assertEquals(30, msc300.addIntegers(29,1));
        // Step 3. it means that you will have saved something to the memory store.
        // Check that with an asserts
        assertEquals(30, msc300.getMemoryStore());

        // Step 4. reset memory, and check with asserts this was done as expected.
        assertEquals(true, msc300.resetMemory());
        assertEquals( 0, msc300.getMemoryStore() );
    }
    @Test
    void pretendToThink() throws Exception {
        MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");
        assertTimeout( Duration.ofMillis(2405) ,()-> msc300.pretendToThink(2400));
    }
    @Test
    @RepeatedTest(10)
    void pretendToThinkMultiple() throws Exception {
        MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");
        assertTimeout( Duration.ofMillis(2405) ,()-> msc300.pretendToThink(2400));
    }

    @Test
    @DisplayName("Check Exception thrown when calling Constructor with reserved ID number (999)")
    void checkExceptionThrownConstructor() throws Exception {
        // Extra extension question.
        fail("not implemented yet");

     }
}
