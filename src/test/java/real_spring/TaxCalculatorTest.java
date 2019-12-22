package real_spring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorTest {

    @Test
    public void withMaam() {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamRelsover mock = Mockito.mock(MaamRelsover.class);
        Mockito.when(mock.getMaam()).thenReturn(0.10);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(110,withMaam,0.000001);
    }


}




