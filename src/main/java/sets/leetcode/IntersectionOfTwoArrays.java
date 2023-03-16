package sets.leetcode;
import java.util.*;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/">...</a>
 * ----------
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 * ----------
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * ----------
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> initialSet = new HashSet<>();
        for (int current : nums1) {
            initialSet.add(current);
        }

        HashSet<Integer> finalSet = new HashSet<>();

        for (int current : nums2) {
            if (initialSet.contains(current)) {
                finalSet.add(current);
            }
        }

        int[] output = new int[finalSet.size()];
        int i = 0;
        for (int current : finalSet) {
            output[i] = current;
            i++;
        }

        return output;
    }

}
