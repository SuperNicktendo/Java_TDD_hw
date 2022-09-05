import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addNumbers(){
        Calculator calcAdd = new Calculator(10, 5,3.5,9.3);
        assertEquals(15, calcAdd.add());
    }

    @Test
    public void subtractNumbers(){
        Calculator calcSub = new Calculator(10,5,3.5,9.3);
        assertEquals(5, calcSub.subtract());
    }

    @Test
    public void multiplyNumbers(){
        Calculator calcMult = new Calculator(10,5,3.5,9.3);
        assertEquals(50, calcMult.multiply());
    }

    @Test
    public void divideNumbers(){
        Calculator calcDiv = new Calculator(10,5,10.00,2.5);
        assertEquals(4, calcDiv.divide(), 0.0);
    }



}
