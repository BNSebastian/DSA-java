package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    @Test
    public void testOne() {
        assertArrayEquals(new int[] {0,1,9,16,100}, SquaresOfASortedArray.sortedSquares(new int[] {-4,-1,0,3,10}));
    }

    @Test
    public void testTwo() {
        assertArrayEquals(new int[] {4,9,9,49,121}, SquaresOfASortedArray.sortedSquares(new int[] {-7,-3,2,3,11}));
    }
}