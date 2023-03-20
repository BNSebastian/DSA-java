package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void testOne() {
        assertArrayEquals(new int[] {3,4},
                FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] {5,7,7,8,8,10}, 8));
    }

    @Test
    public void testTwo() {
        assertArrayEquals(new int[] {-1,-1},
                FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] {5,7,7,8,8,10}, 6));
    }

    @Test
    public void testThree() {
        assertArrayEquals(new int[] {-1,-1},
                FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] {}, 0));
    }
}