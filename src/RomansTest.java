import org.junit.Test;

import static org.junit.Assert.*;

public class RomansTest {
    @Test
    public void convertOne(){
        Romans romans = new Romans();
        assertEquals("I", romans.romanise(1));
    }

}