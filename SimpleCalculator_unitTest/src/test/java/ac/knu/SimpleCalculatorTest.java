package ac.knu;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void plusInt(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int plusResult = simpleCalculator.plusInteger(1,3);
        assertEquals(4,plusResult);
    }

    @Test
    public void multiplyInt(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int multiplyResult = simpleCalculator.multiplyDouble(1,3);
        assertEquals(3,multiplyResult);
    }

    @Test
    public void divideDouble(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double divideResult = simpleCalculator.divideBy(5,1);
        assertTrue(divideResult == 5.0);
    }

    @Test(expected = ArithmeticException.class)
    public void dividezero(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.divideBy(5,0);
    }
}
