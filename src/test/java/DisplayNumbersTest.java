import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisplayNumbersTest {
    @Test
    public void test_01 (){
        assertEquals("12", DisplayNumbers.displayNumbers(1, 2));
    }
    @Test
    public void test_02 (){
        assertEquals("4", DisplayNumbers.displayNumbers(0, 4));
    }
    @Test
    public void test_03 (){
        assertEquals("72", DisplayNumbers.displayNumbers(7, 2));
    }

    @Test
    public void test_04 (){
        assertEquals("98", DisplayNumbers.displayNumbers(9, 8));
    }

    @Test
    public void test_05 (){
        assertEquals("75", DisplayNumbers.displayNumbers(7, 5));
    }

}
