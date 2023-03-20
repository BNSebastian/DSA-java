package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    public void testOne() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void testTwo() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[] {1,1}));
    }

}