import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printerHasPaper(){
        assertEquals(50,printer.paper);
    }

    @Test
    public void printerHasToner(){
        assertEquals(50,printer.toner);
    }

    @Test
    public void printerPrints(){
        printer.print(2,5);
        assertEquals(40, printer.paper);
    }

    @Test
    public void printerWontPrintIfNotEnoughPaper(){
        printer.print(10,6);
        assertEquals(50, printer.paper);
    }

    @Test
    public void tonerIsReducedWhenPrinting(){
        printer.print(2,5);
        assertEquals(48, printer.toner);
    }
}