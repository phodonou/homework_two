package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class ImprovedStringTokenizerTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void allRemainingTokensReturnsCorrectArray() {
        //don't neet to be tested individually but will satisfy coverage
        new ImprovedStringTokenizer("", "");
        new ImprovedStringTokenizer("", "", true);

        ImprovedStringTokenizer improvedStringTokenizer = new ImprovedStringTokenizer("This class is easy");
        String[] allRemainingTokens = improvedStringTokenizer.allRemainingTokens();
        String[] correctRemainingTokens = { "This", "class", "is", "easy", };
        assertTrue(Arrays.equals(allRemainingTokens, correctRemainingTokens));
    }

    @Test
    public void allRemainingTokensReturnsCorrectArrayWhenTokenizerIsAlreadyActive() {
        ImprovedStringTokenizer improvedStringTokenizer = new ImprovedStringTokenizer("This class is easy");
        String[] allRemainingTokens = {};
        String[] correctRemainingTokens = { "class", "is", "easy", };
        while (improvedStringTokenizer.hasMoreTokens()) {
            improvedStringTokenizer.nextToken();
            allRemainingTokens = improvedStringTokenizer.allRemainingTokens();
            break;
        }
        assertTrue(Arrays.equals(allRemainingTokens, correctRemainingTokens));
    }
}
