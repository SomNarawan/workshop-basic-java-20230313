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
}