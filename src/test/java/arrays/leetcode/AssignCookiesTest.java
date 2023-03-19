package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignCookiesTest {

    @Test
    public void testOne() {
        assertEquals(1, AssignCookies.findContentChildren(new int[] {3, 2, 1}, new int[] {1, 1}));
    }

    @Test
    public void testTwo() {
        assertEquals(2, AssignCookies.findContentChildren(new int[] {1, 2}, new int[] {1, 2, 3}));
    }

}