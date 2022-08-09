## RMIT Software Testing ISYS1085 / ISYS1087

### Week 3/4 Prac Junit Exercise 

##### "Never in the field of software development have so many owed so much to so few lines of code" (Martin Fowler)

#### Objectives
These prac exercises are focussed on Junit 5 and are pitched to students with some minimal exposure to unit testing in earlier courses. 
The objective over the two weeks is for students to feel comfortable using common Junit 5 commands like:- 
- fail 
- assertEquals
- assertSame 
- assertTrue / assertFalse
- assertThrows Exception classes

Other objectives include using Junit to:-
- write test cases before implementing the code being tested 
- disabling / nesting / organising your test cases and making the unit test results user friendly 
- perform some simple timing related tests  

#### Preparation

Get ready with a recent/latest version of Eclipse or IntelliJ and java compiler version and using provided maven dependencies.

#### Week 3 Tasks

* Once your IDE is set up, clone or download the code. The MyCalculator class implements the Calculator interface, and there is one test class. Note their folder locations.
* Continue your work in your own environment - no pull requests expected or necessary
* See if you can run the Java Application (should have no output) and then the Junit Test (should have one fail)
* Review the commented out test functions in MyCalculatorTest.java to get you started with some ideas.
* Start writing test cases using those suggested test function names, or rename as required.
* Is one test case enough to test each method? Consider why you might need to have more than one test case to check a variety of different inputs or conditions.
* Consider where you might use assertTrue and also assertFalse
* Consider where you expect a null or not-null return or condition.
* Consider what Exceptions might be thrown by one or more of the calculator functions, and write a test method to check for that.

#### References

* https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
* https://www.jetbrains.com/help/idea/junit.html
* https://www.linkedin.com/learning/practical-test-driven-development-for-java-programmers/using-tdd-to-safely-fix-bugs?u=2104756 (Videos - thank you Natalie)
* https://i.gyazo.com/5257c88eca4cedd12be1a15569bf4741.png (IntelliJ screenshot showing bug in expected value of addIntegers method)
* https://www.javaguides.net/p/junit-5.html
* https://dzone.com/articles/writing-tests-with-junit-5 ((IDEA-focussed intro from IDEA writer))
