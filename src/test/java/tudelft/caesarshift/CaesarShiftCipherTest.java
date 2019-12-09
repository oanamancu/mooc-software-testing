package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    /*
    0) 0
    1) pozitive
        a) with cycle
        b) without cycle
    2) negative
        a) with cycle
        b) without cycle
    3) forbidden characters (upper/semne)

    a) one letter
    b) more letters

     */

    @ParameterizedTest(name="inputString={0} inputNo={1} expected={2}")
    @CsvSource({"a,0,a", "ab,2,cd", "def,-3,abc", "XG,-1,invalid", "de f,-3,ab c", "a_g!,1,invalid", "xy,5,cd", "def,-6,xyz"})
    public void caesarShiftCipherTest(String inputString, int inputNo, String expected){
         Assertions.assertEquals(expected, new CaesarShiftCipher().CaesarShiftCipher(inputString, inputNo));
    }
}
