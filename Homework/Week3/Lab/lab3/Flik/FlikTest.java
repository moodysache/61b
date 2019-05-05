import org.junit.Test;

import static org.junit.Assert.*;

public class FlikTest {

    @Test
    public void isSameNumber() {

        Integer a=30;
        Integer b=30;
        assertTrue(Flik.isSameNumber(a,b));


        Integer c=128;
        Integer d=129;
        assertFalse(Flik.isSameNumber(c,d));


        Integer e=1000;
        Integer f=1000;
        assertTrue(Flik.isSameNumber(e,f));
    }
}