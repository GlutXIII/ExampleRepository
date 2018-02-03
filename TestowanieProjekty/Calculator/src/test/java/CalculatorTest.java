import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @author Piotr Lewczuk(plewczuk08@wp.pl)
 */
public class CalculatorTest {
    private Calculator testedCalculator = new Calculator();

    @Test
    public void addTest(){
        assertEquals(3.0,testedCalculator.add(1,2));
        assertEquals(1.5,testedCalculator.add(0.75,0.75));
    }

    @Test
    public void substractTest(){
        assertEquals(-1.0,testedCalculator.substract(1,2));
        assertEquals(0.0,testedCalculator.substract(0.75,0.75));
    }

    @Test
    public void divideFailTest(){
        try{
            testedCalculator.divide(0,1);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().contains("Divider cannot equals zero!"));
            return;
        }
        assertFalse(Boolean.TRUE);
    }
    @Test
    public void divideSuccessTest(){
        assertEquals(0.5,testedCalculator.divide(4,2));
        assertEquals(-0.5,testedCalculator.divide(-4,2));
    }

}
