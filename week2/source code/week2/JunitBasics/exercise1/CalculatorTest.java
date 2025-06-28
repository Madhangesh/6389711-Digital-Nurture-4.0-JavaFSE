package week2.JunitBasics.exercise1;


import static org.testng.Assert.assertEquals;

public class CalculatorTest {


    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);  // checks if result == 5
    }
}
