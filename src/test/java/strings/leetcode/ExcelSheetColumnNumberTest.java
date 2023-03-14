package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {

    @Test
    void testOne() {
        var instance = new ExcelSheetColumnNumber();
        assertEquals(1, instance.titleToNumber("A"));
        assertEquals(28, instance.titleToNumber("AB"));
    }
}