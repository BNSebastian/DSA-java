package binarySearch.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testOne(){
        var instance = new BinarySearch();
        assertEquals(4, instance.search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, instance.search(new int[] {-1,0,3,5,9,12}, 2));
    }
}