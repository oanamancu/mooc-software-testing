package tudelft.sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void twoNumbersSumTest2() {
        ArrayList<Integer> first = new ArrayList<Integer>() {{
            add(9);
            add(9);
            add(9);
        }};
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 9, 9, 8));
        assertEquals(expected, new TwoNumbersSum().addTwoNumbers(first, second));
    }


}
