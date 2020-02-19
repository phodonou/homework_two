package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImprovedRandomTest {
    @Test
    public void randomNumberIsBetweem() {
        // doesn't need to be tested but will satisfy coverage

        new ImprovedRandom(1);
        ImprovedRandom improvedRandom = new ImprovedRandom();
        int randNum = improvedRandom.nextIntBetween(1, 5);
        assertTrue(randNum >= 1 && randNum < 5);
    }
}
