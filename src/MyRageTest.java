import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRageTest {

    @Test
    public void startWithInclude () {
        MyRage myRage = new MyRage("[1,5]");
        boolean isInclude = myRage.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude () {
        MyRage myRage = new MyRage("(1,5]");
        boolean isInclude = myRage.checkStartWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getFirstNumberAndStartWithInclude () {
        MyRage myRage = new MyRage("[1,5]");
        int firstNumber = myRage.getFistNumber();
        assertEquals(1, firstNumber);
    }

    @Test
    public void getFirstNumberAndStartWithExclude () {
        MyRage myRage = new MyRage("(1,5]");
        int firstNumber = myRage.getFistNumber();
        assertEquals(2, firstNumber);
    }

    @Test
    public void endWithInclude () {
        MyRage myRage = new MyRage("[1,5]");
        boolean isInclude = myRage.checkEndWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void endWithExclude () {
        MyRage myRage = new MyRage("[1,5)");
        boolean isInclude = myRage.checkEndWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getSecondNumberAndStartWithInclude () {
        MyRage myRage = new MyRage("[1,5]");
        int firstNumber = myRage.getSecondNumber();
        assertEquals(5, firstNumber);
    }

    @Test
    public void getSecondNumberAndStartWithExclude () {
        MyRage myRage = new MyRage("[1,5)");
        int firstNumber = myRage.getSecondNumber();
        assertEquals(4, firstNumber);
    }

    @Test
    public void result01 () {
        MyRage myRage = new MyRage("[1,5]");
        String result = myRage.getResult();
        assertEquals("1,2,3,4,5" ,result);
    }

    @Test
    public void result02 () {
        MyRage myRage = new MyRage("(1,5]");
        String result = myRage.getResult();
        assertEquals("2,3,4,5" ,result);
    }

    @Test
    public void result03 () {
        MyRage myRage = new MyRage("[1,5)");
        String result = myRage.getResult();
        assertEquals("1,2,3,4" ,result);
    }

    @Test
    public void result04 () {
        MyRage myRage = new MyRage("(1,5)");
        String result = myRage.getResult();
        assertEquals("2,3,4" ,result);
    }
}