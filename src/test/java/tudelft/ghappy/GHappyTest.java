package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    /*
    0) null
    1) just one letter: 1 g / other
    2) gg, xgy: g pe 0, g pe n-1, g la mijloc
    3) more gs: 2 happy, none happy, 1 happy one not
     */

    @ParameterizedTest(name="input={0}, expected={1}")
    @CsvSource({"null,true", "g, false", "a,true", "gg,true", "ag,false", "ga,false", "ggg,true", "ggabc,true", "abcgg,true",
                "abcggrghjk, false", "gabc, false", "abcghjktyu, false", "abcg,false", "agbchf,false", "afsdhdgh,false",
                 "hdfggjddgg,true", "fdgjhgkd,false", "fgghjggkdfg,false"})
    public void gHappyTest(String input, boolean expected){
        Assertions.assertEquals( expected , new GHappy().gHappy(input) );
    }

}
