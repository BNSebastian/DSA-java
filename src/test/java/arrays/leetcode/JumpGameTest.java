package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    public void testOne() {
        assertTrue(JumpGame.canJump(new int[] {2,3,1,1,4}));
    }

    @Test
    public void testTwo() {
        assertFalse(JumpGame.canJump(new int[] {3,2,1,0,4}));
    }

    @Test
    public void testThree() {
        assertTrue(JumpGame.canJump(new int[] {2,0,0}));
    }
}