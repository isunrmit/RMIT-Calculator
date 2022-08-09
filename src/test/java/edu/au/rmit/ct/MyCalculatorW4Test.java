package edu.au.rmit.ct;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;

public class MyCalculatorW4Test {

    @Test
    @DisplayName("Example of testing the default constructor with no params")
    void checkDefaultConstructor() {
        MySecondCalculator msc999 = new MySecondCalculator();
        // check ID and name with asserts
        fail("Not implemented yet");


    }

    @Test
    @DisplayName("Example of AssertTrue @DisplayName / AssertFalse and Reset Memory")
    void checkBooleanReturnResetMemory() throws Exception {
        MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");
        fail("Not implemented yet");

        // Step 1. reset memory of the calculator. Use an assert method to check this was done correctly

        // Step 2. check value of adding 29 + 1. you should get an expected result, also

        // Step 3. it means that you will have saved something to the memory store.
        // Check that with an asserts

        // Step 4. reset memory, and check with asserts this was done as expected.

    }
    @Test
    void pretendToThink() throws Exception {
        MySecondCalculator msc300 = new MySecondCalculator(300, "Advanced Model");
        fail("not implemented yet. Run me first to see what i do");
    }

    @Test
    @DisplayName("Check Exception thrown when calling Constructor with reserved ID number (999)")
    void checkExceptionThrownConstructor() {
        fail("not implemented yet");
    }
}
