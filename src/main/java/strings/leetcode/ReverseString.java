package strings.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">...</a>
 * ----------
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *-----------
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *-----------
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

public class ReverseString {

    public void reverseString(char[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right)
        {
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left ++;
            right --;
        }
    }

}
