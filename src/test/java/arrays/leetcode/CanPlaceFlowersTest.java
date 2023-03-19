package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    public void testOne() {
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
    }

    @Test
    public void testTwo() {
        assertFalse(CanPlaceFlowers.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
    }

    @Test
    public void testThree() {
        assertTrue(CanPlaceFlowers.canPlaceFlowers(new int[] {0,0,1,0,0}, 1));
    }
}