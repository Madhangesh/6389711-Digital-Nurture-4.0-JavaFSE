package week2.JunitBasics.exercise4;


import week2.JunitBasics.exercise1.Calculator;

import static org.junit.Assert.assertEquals;

//
//public class CalculatorTest {
//
//    private Calculator calculator;
//
//    // Arrange – setup before each test
//    @BeforeEach
//    public void setUp() {
//        calculator = new Calculator();
//        System.out.println("Setup before test");
//    }
//
//    // Teardown – clean up after each test
//    @AfterEach
//    public void tearDown() {
//        calculator = null;
//        System.out.println("Teardown after test");
//    }
//
//    @Test
//    public void testAddition() {
//        // Act
//        int result = calculator.add(2, 3);
//
//        // Assert
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void testMultiplication() {
//        // Act
//        int result = calculator.multiply(4, 5);
//
//        // Assert
//        assertEquals(20, result);
//    }
//}
