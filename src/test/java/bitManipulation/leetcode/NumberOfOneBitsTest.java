package bitManipulation.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBitsTest {

    @Test
    void testOne() {
        var test = new NumberOfOneBits();
        assertEquals(2, test.hammingWeight(3));
    }
}