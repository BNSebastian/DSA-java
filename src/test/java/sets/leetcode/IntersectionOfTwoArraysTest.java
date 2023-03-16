package sets.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    @Test
    public void intersectionOfTwoArraysTest() {
        var instance = new IntersectionOfTwoArrays();
        assertArrayEquals(new int[] {2}, instance.intersection(new int[] {1,2,2,1}, new int[] {2,2}));
        assertArrayEquals(new int[] {4,9}, instance.intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }

}