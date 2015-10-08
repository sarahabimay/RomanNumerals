import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomansTest {

    private Romans romans;

    @Before
    public void setUp() throws Exception {
        romans = new Romans();
    }

    @Test
    public void convertOne() {
        assertEquals("I", romans.romanise(1));
    }

    @Test
    public void convertTwo() {
        assertEquals("II", romans.romanise(2));
    }

    @Test
    public void convertThree() {
        assertEquals("III", romans.romanise(3));
    }

    @Test
    @Ignore
    public void convertFour() {
        assertEquals("IV", romans.romanise(4));

    }
}