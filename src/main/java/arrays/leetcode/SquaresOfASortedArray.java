package arrays.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">...</a>
 * ----------
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * ----------
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * ----------
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squared[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(squared);

        return squared;
    }

}
