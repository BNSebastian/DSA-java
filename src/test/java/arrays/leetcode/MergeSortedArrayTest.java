package arrays.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void testOne() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] output = {1, 2, 2, 3, 5, 6};
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(output, nums1);
    }

    @Test
    public void testTwo() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] output = {1};
        MergeSortedArray.merge(nums1, 1, nums2, 0);
        assertArrayEquals(output, nums1);
    }

    @Test
    public void testThree() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] output = {1};
        MergeSortedArray.merge(nums1, 0, nums2, 1);
        assertArrayEquals(output, nums1);
    }
}