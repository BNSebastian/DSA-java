package map.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    public void testOne() {
        int input = SingleNumber.singleNumber(new int[] {2, 2, 1});
        assertEquals(1, input);
    }

    @Test
    public void testTwo() {
        int input = SingleNumber.singleNumber(new int[] {4, 1, 2, 1, 2});
        assertEquals(4, input);
    }

    @Test
    public void testThree() {
        int input = SingleNumber.singleNumber(new int[] {1});
        assertEquals(1, input);
    }

}