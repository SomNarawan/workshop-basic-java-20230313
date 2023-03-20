import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    @DisplayName("Empty list should be sorted")
    public void caseEmpty(){
        List<Integer> expectResult = new ArrayList<>();

        MySort mySort = new MySort();
        List<Integer> inputs = Arrays.asList();
        List<Integer> actualResult = mySort.sort(inputs);
        assertEquals(expectResult, actualResult);
    }

}