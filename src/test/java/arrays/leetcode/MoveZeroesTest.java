package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    public void testOne() {
        int[] input = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, input);
    }

    @Test
    public void testTwo() {
        int[] input = {0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[] {0}, input);
    }
}