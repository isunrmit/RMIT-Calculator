package edu.au.rmit.ct;

// Tasks for Week 5
// 1. Ordering by method name, and order annotation
// 2. Export to report
// 3. Check message of exception thrown
// 4. AAA

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
// @TestMethodOrder(MethodOrderer.MethodName.class)
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class MySecondCalculatorTestW5 {

    @Test
    //@Order(4)
    @DisplayName("Check Exception thrown when calling Constructor with reserved ID number (999)")
    void checkMessageOfExceptionThrown() throws Exception {
        // MySecondCalculator msc300 = new MySecondCalculator(999, "Advanced Model");
   }

    @Test
    // @Order(3)
    @DisplayName("0. Demo of Ordering")
    void test0() throws Exception {
        fail("not implemented");
    }



    @Test
    // @Order(2)
    @DisplayName("1. Demo of Ordering")
    void test1() throws Exception {
        fail("not implemented");
   }
    @Test
    // @Order(1)
    @DisplayName("2. Demo of Ordering")
    void test2() throws Exception {
        fail("not implemented");
    }
}