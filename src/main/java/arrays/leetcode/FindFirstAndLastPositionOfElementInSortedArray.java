package arrays.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">...</a>
 * ----------
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * ----------
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * ----------
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * ----------
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {

        int[] output = new int[2];
        Arrays.fill(output, -1);

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (j == 0) {
                    output[j] = i;
                    output[j + 1] = i;
                    j++;
                } else {
                    output[j] = i;
                }
            }
        }

        return new int[] {output[0], output[1]};
    }
}
