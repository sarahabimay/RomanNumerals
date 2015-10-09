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
    public void convertFour() {
        assertEquals("IV", romans.romanise(4));
    }

    @Test
    public void convertFive() {
        assertEquals("V", romans.romanise(5));
    }

    @Test
    public void convertNine() {
        assertEquals("IX", romans.romanise(9));

    }

    @Test
    public void convertTen() {
        assertEquals("X", romans.romanise(10));
    }

    @Test
    public void convertFourty() {
        assertEquals("XL", romans.romanise(40));
    }

    @Test
    public void convertFifty() {
        assertEquals("L", romans.romanise(50));
    }

    @Test
    public void convertNinety() {
        assertEquals("XC", romans.romanise(90));

    }

    @Test
    public void convertHundred() {
        assertEquals("C", romans.romanise(100));
    }

    @Test
    public void convertFourHundred() {
        assertEquals("CD", romans.romanise(400));
    }

    @Test
    public void converte5Hundred() {
        assertEquals("D", romans.romanise(500));
    }

    @Test
    public void convert9Hundered() {
        assertEquals("CM", romans.romanise(900));
    }

    @Test
    public void convertThousand() {
        assertEquals("M", romans.romanise(1000));
    }

    @Test
    public void convertComplexNumber() {
        assertEquals("MMMCMXCIX", romans.romanise(3999));
    }
}