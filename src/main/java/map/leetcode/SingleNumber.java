package map.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/single-number/">...</a>
 * ----------
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * ----------
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * ----------
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * ----------
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numberOccurence = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (numberOccurence.get(nums[i]) == null) {
                numberOccurence.putIfAbsent(nums[i], 1);
            } else {
                numberOccurence.put(nums[i], numberOccurence.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numberOccurence.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                return key;
            }
        }

        return -1;
    }

}
