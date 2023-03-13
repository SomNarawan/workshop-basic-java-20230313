import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย default constructor จะต้องได้  fullname = '? ?'")
    public void case01() {
        String expectedResult = "? ?";

        Employee demo = new Employee();
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย default constructor จะต้องได้  fullname = 'Narawan Iamsaard'")
    public void case02() {
        String expectedResult = "Narawan Iamsaard";

        Employee demo = new Employee("Narawan", "Iamsaard");
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }
}