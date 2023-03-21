package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    public void testOne() {
        assertArrayEquals(
                new int[] {-1,3,-1},
                NextGreaterElement.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2})
        );
    }

    @Test
    public void testTwo() {
        assertArrayEquals(
                new int[] {3,-1},
                NextGreaterElement.nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4})
        );
    }

}