import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    @DisplayName("Empty list should be sorted")
    public void case01(){
        List<Integer> expectResult = Arrays.asList();

        MySort mySort = new MySort();
        List<Integer> inputs = Arrays.asList();
        List<Integer> actualResult = mySort.sort(inputs);
        assertEquals(expectResult, actualResult);
    }

    @Test
    @DisplayName("[1,2] => [1,2]")
    public void case02(){
        List<Integer> expectResult = Arrays.asList(1,2);

        MySort mySort = new MySort();
        List<Integer> inputs = Arrays.asList(1,2);
        List<Integer> actualResult = mySort.sort(inputs);
        assertEquals(expectResult, actualResult);
    }

}