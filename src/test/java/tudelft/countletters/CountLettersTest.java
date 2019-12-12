package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @ParameterizedTest(name="input={0} expected={1}")
    @CsvSource({"car|apple|juice,1", "mirror,1"})
    public void completion1(String input, int expected) {
        int words = new CountLetters().count(input);
        Assertions.assertEquals(expected, words);
    }

}