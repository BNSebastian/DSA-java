package strings.leetcode;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 * ----------
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *-----------
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *-----------
 *Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (String string : strings) {
            while (string.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
