package strings.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">...</a>
 * ----------
 * Given a string s, reverse the order of characters in each word within
 * a sentence while still preserving whitespace and initial word order.
 * ----------
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * ----------
 * Example 2:
 * Input: s = "God Ding"
 * Output: "doG gniD"
 * ----------
 *
 */

public class ReverseWordsInAStringThree {

    public static String reverseWords(String word) {
        String[] wordArray = word.split(" ");
        StringBuilder output = new StringBuilder();
        for (String current : wordArray) {
            output.append(new StringBuilder(current).reverse() + " ");
        }
        return output.toString().trim();
    }


}
