package com.company.reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class TextStatisticsTest {

    @Test
    public void checkCharacters() {
        String content = "1234";

        Assertions.assertEquals(4, TextStatistics.getCharsCount(content));
    }

    @Test
    public void checkCharacters1() {
        String content = " Ala ma Kota.";

        Assertions.assertEquals(13, TextStatistics.getCharsCount(content));
    }

    @Test
    public void checkCharacters2() {
        String content = "AlaMaKota";

        Assertions.assertEquals(9, TextStatistics.getCharsCount(content));
    }

    @Test
    public void checkCharacters3() {
        String content = "A l a M a K o t a";

        Assertions.assertEquals(17, TextStatistics.getCharsCount(content));
    }

}
