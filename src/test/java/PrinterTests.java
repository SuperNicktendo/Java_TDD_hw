import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        assertEquals(true, printer.canPrint(10, 5));
    }

    @Test
    public void doesNotHaveEnoughPaperToPrint(){
        assertEquals(false, printer.canPrint(20, 10));
    }

    @Test
    public void printingReducesPaper(){
        printer.canPrint(5,2);
        assertEquals(90, printer.getSheets());
    }

    @Test
    public void printingReducesToner(){
        printer.canPrint(5,2);
        assertEquals(90, printer.getToner());
    }




}
