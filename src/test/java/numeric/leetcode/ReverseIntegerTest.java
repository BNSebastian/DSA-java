package numeric.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void testOne() {
        var test = new ReverseInteger();
        assertEquals(321, test.reverse1(123));
        assertEquals(-321, test.reverse1(-123));
    }
}