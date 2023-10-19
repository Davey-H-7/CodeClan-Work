import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
        public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(12, calculator.add(10,2));
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(8, calculator.subtract(10,2));
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(20, calculator.multiply(10,2));
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(4, calculator.divide(20.00,5.00), 0.00);
    }

}
