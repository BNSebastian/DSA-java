package arrays.leetcode;

/**
 * <a href="https://leetcode.com/problems/can-place-flowers/">...</a>
 * ----------
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
 * and an integer n, return if n new flowers can be planted in the flowerbed
 * without violating the no-adjacent-flowers rule.
 * ----------
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * ----------
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int newPlants = 0;
        int length = flowerbed.length;

        if (n == 0) {
            return true;
        }

        if (length == 0) {
            return false;
        }

        if (length == 1) {
            if (flowerbed[0] == 0) {
                newPlants++;
            }
            return newPlants >= n;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            newPlants++;
        }

        if (flowerbed[length - 2] == 0 && flowerbed[length - 1] == 0) {
            flowerbed[length - 1] = 1;
            newPlants++;
        }

        for (int i = 1; i < length - 1; i ++){
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                newPlants++;
            }
        }

        return newPlants >= n;
    }

}
